package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v6 extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public TLRPC.RequestPeerType a;
    public ArrayList b;

    public final void a(Boolean bool, int i10, int i11) {
        ArrayList arrayList = this.b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(w6.a(AndroidUtilities.replaceTags(LocaleController.getString(i10))));
            } else {
                arrayList.add(w6.a(AndroidUtilities.replaceTags(LocaleController.getString(i11))));
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
                        arrayList.add(w6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelBotParticipant))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(w6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelCreatorTrue))));
                    }
                } else {
                    a(requestPeerType.has_username, R.string.PeerRequirementGroupPublicTrue, R.string.PeerRequirementGroupPublicFalse);
                    a(requestPeerType.forum, R.string.PeerRequirementForumTrue, R.string.PeerRequirementForumFalse);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(w6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupBotParticipant))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(w6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupCreatorTrue))));
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
                            org.telegram.ui.d3.q(1, z10 ? LocaleController.getString(R.string.EditAdminChangeChannelInfo) : LocaleController.getString(R.string.EditAdminChangeGroupInfo), arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z10) {
                            org.telegram.ui.d3.q(1, LocaleController.getString(R.string.EditAdminPostMessages), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z10) {
                            org.telegram.ui.d3.q(1, LocaleController.getString(R.string.EditAdminEditMessages), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            org.telegram.ui.d3.q(1, LocaleController.getString(z10 ? R.string.EditAdminDeleteMessages : R.string.EditAdminGroupDeleteMessages), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z10) {
                            org.telegram.ui.d3.q(1, LocaleController.getString(R.string.EditAdminBanUsers), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            org.telegram.ui.d3.q(1, LocaleController.getString(R.string.EditAdminAddUsers), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z10) {
                            org.telegram.ui.d3.q(1, LocaleController.getString(R.string.EditAdminPinMessages), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            org.telegram.ui.d3.q(1, LocaleController.getString(R.string.EditAdminAddAdmins), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z10) {
                            org.telegram.ui.d3.q(1, LocaleController.getString(R.string.EditAdminSendAnonymously), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            org.telegram.ui.d3.q(1, LocaleController.getString(R.string.StartVoipChatPermission), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z10) {
                            org.telegram.ui.d3.q(1, LocaleController.getString(R.string.ManageTopicsPermission), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(w6.a(TextUtils.concat(replaceTags2, " ", ((w6) arrayList2.get(0)).b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(replaceTags);
                            valueOf.append((CharSequence) " ");
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                if (i12 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((w6) arrayList2.get(i12)).b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(w6.a(valueOf));
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            q4 q4Var = new q4(getContext(), 20);
            q4Var.setText(LocaleController.getString(R.string.PeerRequirements));
            int i13 = org.telegram.ui.ActionBar.y6.d6;
            org.telegram.ui.ActionBar.f7.i(i13, q4Var, null);
            addView(q4Var, gb1.r(-1, -2));
            View x3Var = new x3(getContext(), 9, 1);
            x3Var.setBackground(null);
            org.telegram.ui.ActionBar.f7.i(i13, x3Var, null);
            addView(x3Var, gb1.r(-1, -2));
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                w6 w6Var = (w6) obj;
                Context context = getContext();
                u6 u6Var = new u6(context);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, u6Var, null);
                u6Var.setOrientation(0);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(w6Var.a <= 0 ? R.drawable.list_check : R.drawable.list_circle);
                org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.L6, null, PorterDuff.Mode.MULTIPLY);
                u6Var.addView(imageView, gb1.t(20, 20, 0.0f, 51, (w6Var.a * 16) + 17, -1, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.z6, null);
                textView.setSingleLine(false);
                textView.setText(w6Var.b);
                u6Var.addView(textView, gb1.x(-1, -2, 1, 6, 4, 24, 4));
                addView(u6Var, gb1.r(-1, -2));
            }
            int i15 = org.telegram.ui.ActionBar.y6.d6;
            View x3Var2 = new x3(getContext(), 12, 1);
            x3Var2.setBackground(null);
            org.telegram.ui.ActionBar.f7.i(i15, x3Var2, null);
            addView(x3Var2, gb1.r(-1, -2));
            Drawable X0 = org.telegram.ui.ActionBar.y6.X0(getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.b7);
            View x3Var3 = new x3(getContext(), 12, 1);
            x3Var3.setBackground(X0);
            addView(x3Var3, gb1.r(-1, -2));
        }
    }
}
