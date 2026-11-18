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
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class o6 extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public TLRPC.RequestPeerType a;
    public ArrayList b;

    public final void a(Boolean bool, int i7, int i10) {
        ArrayList arrayList = this.b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(p6.a(org.telegram.messenger.g0.W2(gd.M0(i7, null))));
            } else {
                arrayList.add(p6.a(org.telegram.messenger.g0.W2(gd.M0(i10, null))));
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
                a(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, 2131747146, 2131747147);
            } else {
                boolean z10 = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z10) {
                    a(requestPeerType.has_username, 2131747154, 2131747155);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(p6.a(org.telegram.messenger.g0.W2(gd.M0(2131747157, null))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(p6.a(org.telegram.messenger.g0.W2(gd.M0(2131747156, null))));
                    }
                } else {
                    a(requestPeerType.has_username, 2131747148, 2131747149);
                    a(requestPeerType.forum, 2131747152, 2131747153);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(p6.a(org.telegram.messenger.g0.W2(gd.M0(2131747151, null))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(p6.a(org.telegram.messenger.g0.W2(gd.M0(2131747150, null))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.M0(2131747144, null));
                    SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(gd.M0(2131747145, null));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            c0.r(1, z10 ? gd.M0(2131751313, null) : gd.M0(2131751312, null), arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z10) {
                            c0.r(1, gd.M0(2131751301, null), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z10) {
                            c0.r(1, gd.M0(2131751308, null), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            c0.r(1, gd.M0(z10 ? 2131751310 : 2131751305, null), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z10) {
                            c0.r(1, gd.M0(2131751317, null), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            c0.r(1, gd.M0(2131751319, null), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z10) {
                            c0.r(1, gd.M0(2131751302, null), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            c0.r(1, gd.M0(2131751320, null), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z10) {
                            c0.r(1, gd.M0(2131751292, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            c0.r(1, gd.M0(2131744666, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z10) {
                            c0.r(1, gd.M0(2131748500, null), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(p6.a(TextUtils.concat(W22, " ", ((p6) arrayList2.get(0)).b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(W2);
                            valueOf.append((CharSequence) " ");
                            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                                if (i10 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((p6) arrayList2.get(i10)).b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(p6.a(valueOf));
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            n4 n4Var = new n4(getContext(), 20);
            n4Var.setText(gd.M0(2131747143, null));
            int i11 = org.telegram.ui.ActionBar.n6.d6;
            org.telegram.ui.ActionBar.u6.h(i11, n4Var, null);
            addView(n4Var, c8.ma.o(-1, -2));
            View v3Var = new v3(getContext(), 9, 1);
            v3Var.setBackground(null);
            org.telegram.ui.ActionBar.u6.h(i11, v3Var, null);
            addView(v3Var, c8.ma.o(-1, -2));
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                p6 p6Var = (p6) obj;
                Context context = getContext();
                ai.r2 r2Var = new ai.r2(context, i7);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, r2Var, null);
                r2Var.setOrientation(0);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(p6Var.a <= 0 ? R.drawable.list_check : R.drawable.list_circle);
                org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.L6, null, PorterDuff.Mode.MULTIPLY);
                r2Var.addView(imageView, c8.ma.q(20, 20, 0.0f, 51, (p6Var.a * 16) + 17, -1, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.z6, null);
                textView.setSingleLine(false);
                textView.setText(p6Var.b);
                r2Var.addView(textView, c8.ma.t(-1, -2, 1, 6, 4, 24, 4));
                addView(r2Var, c8.ma.o(-1, -2));
            }
            int i13 = org.telegram.ui.ActionBar.n6.d6;
            View v3Var2 = new v3(getContext(), 12, 1);
            v3Var2.setBackground(null);
            org.telegram.ui.ActionBar.u6.h(i13, v3Var2, null);
            addView(v3Var2, c8.ma.o(-1, -2));
            Drawable Y0 = org.telegram.ui.ActionBar.n6.Y0(getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.n6.b7);
            View v3Var3 = new v3(getContext(), 12, 1);
            v3Var3.setBackground(Y0);
            addView(v3Var3, c8.ma.o(-1, -2));
        }
    }
}
