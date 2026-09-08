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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class r6 extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public TLRPC.RequestPeerType a;
    public ArrayList b;

    public final void a(Boolean bool, int i10, int i11) {
        ArrayList arrayList = this.b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(s6.a(AndroidUtilities.replaceTags(LocaleController.getString(i10))));
            } else {
                arrayList.add(s6.a(AndroidUtilities.replaceTags(LocaleController.getString(i11))));
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
                        arrayList.add(s6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelBotParticipant))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(s6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelCreatorTrue))));
                    }
                } else {
                    a(requestPeerType.has_username, R.string.PeerRequirementGroupPublicTrue, R.string.PeerRequirementGroupPublicFalse);
                    a(requestPeerType.forum, R.string.PeerRequirementForumTrue, R.string.PeerRequirementForumFalse);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(s6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupBotParticipant))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(s6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupCreatorTrue))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    int i10 = R.string.PeerRequirementUserRights;
                    int i11 = R.string.PeerRequirementUserRight;
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i10));
                    SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(i11));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            p6.r(z10 ? LocaleController.getString(R.string.EditAdminChangeChannelInfo) : LocaleController.getString(R.string.EditAdminChangeGroupInfo), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z10) {
                            p6.r(LocaleController.getString(R.string.EditAdminPostMessages), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z10) {
                            p6.r(LocaleController.getString(R.string.EditAdminEditMessages), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            p6.r(LocaleController.getString(z10 ? R.string.EditAdminDeleteMessages : R.string.EditAdminGroupDeleteMessages), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z10) {
                            p6.r(LocaleController.getString(R.string.EditAdminBanUsers), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            p6.r(LocaleController.getString(R.string.EditAdminAddUsers), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z10) {
                            p6.r(LocaleController.getString(R.string.EditAdminPinMessages), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            p6.r(LocaleController.getString(R.string.EditAdminAddAdmins), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z10) {
                            p6.r(LocaleController.getString(R.string.EditAdminSendAnonymously), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            p6.r(LocaleController.getString(R.string.StartVoipChatPermission), 1, arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z10) {
                            p6.r(LocaleController.getString(R.string.ManageTopicsPermission), 1, arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(s6.a(TextUtils.concat(replaceTags2, " ", ((s6) arrayList2.get(0)).b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(replaceTags);
                            valueOf.append((CharSequence) " ");
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                if (i12 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((s6) arrayList2.get(i12)).b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(s6.a(valueOf));
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            l4 l4Var = new l4(getContext(), 20);
            l4Var.setText(LocaleController.getString(R.string.PeerRequirements));
            int i13 = org.telegram.ui.ActionBar.j6.d6;
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            addView(l4Var, w7.x5.n(-1, -2));
            Drawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
            View s3Var = new s3(getContext(), 9, 1);
            s3Var.setBackground(colorDrawable);
            addView(s3Var, w7.x5.n(-1, -2));
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                s6 s6Var = (s6) obj;
                Context context = getContext();
                q6 q6Var = new q6(context);
                q6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                q6Var.setOrientation(0);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(s6Var.a <= 0 ? R.drawable.list_check : R.drawable.list_circle);
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false), PorterDuff.Mode.MULTIPLY));
                q6Var.addView(imageView, w7.x5.p(20, 20, 0.0f, 51, (s6Var.a * 16) + 17, -1, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z6, false));
                textView.setSingleLine(false);
                textView.setText(s6Var.b);
                q6Var.addView(textView, w7.x5.t(-1, -2, 1, 6, 4, 24, 4));
                addView(q6Var, w7.x5.n(-1, -2));
            }
            Drawable colorDrawable2 = new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            View s3Var2 = new s3(getContext(), 12, 1);
            s3Var2.setBackground(colorDrawable2);
            addView(s3Var2, w7.x5.n(-1, -2));
            Drawable V0 = org.telegram.ui.ActionBar.j6.V0(getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7);
            View s3Var3 = new s3(getContext(), 12, 1);
            s3Var3.setBackground(V0);
            addView(s3Var3, w7.x5.n(-1, -2));
        }
    }
}
