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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class n6 extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public TLRPC.RequestPeerType a;
    public ArrayList b;

    public final void a(Boolean bool, int i7, int i10) {
        ArrayList arrayList = this.b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(o6.a(org.telegram.messenger.g0.X2(hd.M0(i7, null))));
            } else {
                arrayList.add(o6.a(org.telegram.messenger.g0.X2(hd.M0(i10, null))));
            }
        }
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        ArrayList arrayList = this.b;
        if (this.a != requestPeerType) {
            this.a = requestPeerType;
            removeAllViews();
            arrayList.clear();
            int i7 = 3;
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                a(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, 2131747339, 2131747340);
            } else {
                boolean z10 = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z10) {
                    a(requestPeerType.has_username, 2131747347, 2131747348);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(hd.M0(2131747350, null))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(hd.M0(2131747349, null))));
                    }
                } else {
                    a(requestPeerType.has_username, 2131747341, 2131747342);
                    a(requestPeerType.forum, 2131747345, 2131747346);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(hd.M0(2131747344, null))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(hd.M0(2131747343, null))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.M0(2131747337, null));
                    SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(hd.M0(2131747338, null));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            y0.o(1, z10 ? hd.M0(2131751324, null) : hd.M0(2131751323, null), arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z10) {
                            y0.o(1, hd.M0(2131751312, null), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z10) {
                            y0.o(1, hd.M0(2131751319, null), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            y0.o(1, hd.M0(z10 ? 2131751321 : 2131751316, null), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z10) {
                            y0.o(1, hd.M0(2131751328, null), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            y0.o(1, hd.M0(2131751330, null), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z10) {
                            y0.o(1, hd.M0(2131751313, null), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            y0.o(1, hd.M0(2131751331, null), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z10) {
                            y0.o(1, hd.M0(2131751303, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            y0.o(1, hd.M0(2131744901, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z10) {
                            y0.o(1, hd.M0(2131748692, null), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(o6.a(TextUtils.concat(X22, " ", ((o6) arrayList2.get(0)).b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(X2);
                            valueOf.append((CharSequence) " ");
                            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                                if (i10 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((o6) arrayList2.get(i10)).b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(o6.a(valueOf));
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            n4 n4Var = new n4(getContext(), 20);
            n4Var.setText(hd.M0(2131747336, null));
            int i11 = org.telegram.ui.ActionBar.j6.d6;
            org.telegram.ui.ActionBar.q6.h(i11, n4Var, null);
            addView(n4Var, c8.ja.o(-1, -2));
            View v3Var = new v3(getContext(), 9, 1);
            v3Var.setBackground(null);
            org.telegram.ui.ActionBar.q6.h(i11, v3Var, null);
            addView(v3Var, c8.ja.o(-1, -2));
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                o6 o6Var = (o6) obj;
                Context context = getContext();
                ai.q2 q2Var = new ai.q2(context, i7);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, q2Var, null);
                q2Var.setOrientation(0);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(o6Var.a <= 0 ? R.drawable.list_check : R.drawable.list_circle);
                org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.L6, null, PorterDuff.Mode.MULTIPLY);
                q2Var.addView(imageView, c8.ja.q(20, 20, 0.0f, 51, (o6Var.a * 16) + 17, -1, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.z6, null);
                textView.setSingleLine(false);
                textView.setText(o6Var.b);
                q2Var.addView(textView, c8.ja.t(-1, -2, 1, 6, 4, 24, 4));
                addView(q2Var, c8.ja.o(-1, -2));
            }
            int i13 = org.telegram.ui.ActionBar.j6.d6;
            View v3Var2 = new v3(getContext(), 12, 1);
            v3Var2.setBackground(null);
            org.telegram.ui.ActionBar.q6.h(i13, v3Var2, null);
            addView(v3Var2, c8.ja.o(-1, -2));
            Drawable Y0 = org.telegram.ui.ActionBar.j6.Y0(getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7);
            View v3Var3 = new v3(getContext(), 12, 1);
            v3Var3.setBackground(Y0);
            addView(v3Var3, c8.ja.o(-1, -2));
        }
    }
}
