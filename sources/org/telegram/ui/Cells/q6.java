package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q6 extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public TLRPC.RequestPeerType a;
    public ArrayList b;

    public final void a(Boolean bool, int i9, int i10) {
        ArrayList arrayList = this.b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(r6.a(AndroidUtilities.replaceTags(LocaleController.getString(i9))));
            } else {
                arrayList.add(r6.a(AndroidUtilities.replaceTags(LocaleController.getString(i10))));
            }
        }
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        ArrayList arrayList = this.b;
        if (this.a != requestPeerType) {
            this.a = requestPeerType;
            removeAllViews();
            arrayList.clear();
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                a(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, R.string.PeerRequirementPremiumTrue, R.string.PeerRequirementPremiumFalse);
            } else {
                boolean z10 = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z10) {
                    a(requestPeerType.has_username, R.string.PeerRequirementChannelPublicTrue, R.string.PeerRequirementChannelPublicFalse);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(r6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelBotParticipant))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(r6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelCreatorTrue))));
                    }
                } else {
                    a(requestPeerType.has_username, R.string.PeerRequirementGroupPublicTrue, R.string.PeerRequirementGroupPublicFalse);
                    a(requestPeerType.forum, R.string.PeerRequirementForumTrue, R.string.PeerRequirementForumFalse);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(r6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupBotParticipant))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(r6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupCreatorTrue))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    int i9 = R.string.PeerRequirementUserRights;
                    int i10 = R.string.PeerRequirementUserRight;
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i9));
                    SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(i10));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            j2.u(z10 ? LocaleController.getString(R.string.EditAdminChangeChannelInfo) : LocaleController.getString(R.string.EditAdminChangeGroupInfo), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z10) {
                            j2.u(LocaleController.getString(R.string.EditAdminPostMessages), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z10) {
                            j2.u(LocaleController.getString(R.string.EditAdminEditMessages), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            j2.u(LocaleController.getString(z10 ? R.string.EditAdminDeleteMessages : R.string.EditAdminGroupDeleteMessages), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z10) {
                            j2.u(LocaleController.getString(R.string.EditAdminBanUsers), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            j2.u(LocaleController.getString(R.string.EditAdminAddUsers), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z10) {
                            j2.u(LocaleController.getString(R.string.EditAdminPinMessages), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            j2.u(LocaleController.getString(R.string.EditAdminAddAdmins), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z10) {
                            j2.u(LocaleController.getString(R.string.EditAdminSendAnonymously), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            j2.u(LocaleController.getString(R.string.StartVoipChatPermission), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z10) {
                            j2.u(LocaleController.getString(R.string.ManageTopicsPermission), 1, arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(r6.a(TextUtils.concat(replaceTags2, " ", ((r6) arrayList2.get(0)).b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(replaceTags);
                            valueOf.append((CharSequence) " ");
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                if (i11 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((r6) arrayList2.get(i11)).b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(r6.a(valueOf));
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            m4 m4Var = new m4(getContext(), 20);
            m4Var.setText(LocaleController.getString(R.string.PeerRequirements));
            int i12 = org.telegram.ui.ActionBar.f6.d6;
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            addView(m4Var, g7.e6.n(-1, -2));
            Drawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
            View t3Var = new t3(getContext(), 9, 1);
            t3Var.setBackground(colorDrawable);
            addView(t3Var, g7.e6.n(-1, -2));
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                r6 r6Var = (r6) obj;
                Context context = getContext();
                p6 p6Var = new p6(context);
                p6Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                p6Var.setOrientation(0);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(r6Var.a <= 0 ? R.drawable.list_check : R.drawable.list_circle);
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L6, false), PorterDuff.Mode.MULTIPLY));
                p6Var.addView(imageView, g7.e6.p(20, 20, 0.0f, 51, (r6Var.a * 16) + 17, -1, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.z6, false));
                textView.setSingleLine(false);
                textView.setText(r6Var.b);
                p6Var.addView(textView, g7.e6.t(-1, -2, 1, 6, 4, 24, 4));
                addView(p6Var, g7.e6.n(-1, -2));
            }
            Drawable colorDrawable2 = new ColorDrawable(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            View t3Var2 = new t3(getContext(), 12, 1);
            t3Var2.setBackground(colorDrawable2);
            addView(t3Var2, g7.e6.n(-1, -2));
            Drawable V0 = org.telegram.ui.ActionBar.f6.V0(getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7);
            View t3Var3 = new t3(getContext(), 12, 1);
            t3Var3.setBackground(V0);
            addView(t3Var3, g7.e6.n(-1, -2));
        }
    }
}
