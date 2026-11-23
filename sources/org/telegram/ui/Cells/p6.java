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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class p6 extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public TLRPC.RequestPeerType a;
    public ArrayList b;

    public final void a(Boolean bool, int i7, int i10) {
        ArrayList arrayList = this.b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(q6.a(org.telegram.messenger.g0.W2(hd.N0(i7, null))));
            } else {
                arrayList.add(q6.a(org.telegram.messenger.g0.W2(hd.N0(i10, null))));
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
                a(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, 2131747145, 2131747146);
            } else {
                boolean z10 = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z10) {
                    a(requestPeerType.has_username, 2131747153, 2131747154);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(q6.a(org.telegram.messenger.g0.W2(hd.N0(2131747156, null))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(q6.a(org.telegram.messenger.g0.W2(hd.N0(2131747155, null))));
                    }
                } else {
                    a(requestPeerType.has_username, 2131747147, 2131747148);
                    a(requestPeerType.forum, 2131747151, 2131747152);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(q6.a(org.telegram.messenger.g0.W2(hd.N0(2131747150, null))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(q6.a(org.telegram.messenger.g0.W2(hd.N0(2131747149, null))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(hd.N0(2131747143, null));
                    SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(hd.N0(2131747144, null));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            c0.r(1, z10 ? hd.N0(2131751312, null) : hd.N0(2131751311, null), arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z10) {
                            c0.r(1, hd.N0(2131751300, null), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z10) {
                            c0.r(1, hd.N0(2131751307, null), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            c0.r(1, hd.N0(z10 ? 2131751309 : 2131751304, null), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z10) {
                            c0.r(1, hd.N0(2131751316, null), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            c0.r(1, hd.N0(2131751318, null), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z10) {
                            c0.r(1, hd.N0(2131751301, null), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            c0.r(1, hd.N0(2131751319, null), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z10) {
                            c0.r(1, hd.N0(2131751291, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            c0.r(1, hd.N0(2131744658, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z10) {
                            c0.r(1, hd.N0(2131748499, null), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(q6.a(TextUtils.concat(W22, " ", ((q6) arrayList2.get(0)).b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(W2);
                            valueOf.append((CharSequence) " ");
                            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                                if (i10 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((q6) arrayList2.get(i10)).b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(q6.a(valueOf));
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            o4 o4Var = new o4(getContext(), 20);
            o4Var.setText(hd.N0(2131747142, null));
            int i11 = org.telegram.ui.ActionBar.m6.d6;
            org.telegram.ui.ActionBar.t6.h(i11, o4Var, null);
            addView(o4Var, c8.ma.o(-1, -2));
            View w3Var = new w3(getContext(), 9, 1);
            w3Var.setBackground(null);
            org.telegram.ui.ActionBar.t6.h(i11, w3Var, null);
            addView(w3Var, c8.ma.o(-1, -2));
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                q6 q6Var = (q6) obj;
                Context context = getContext();
                ai.u2 u2Var = new ai.u2(context, i7);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, u2Var, null);
                u2Var.setOrientation(0);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(q6Var.a <= 0 ? R.drawable.list_check : R.drawable.list_circle);
                org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.L6, null, PorterDuff.Mode.MULTIPLY);
                u2Var.addView(imageView, c8.ma.q(20, 20, 0.0f, 51, (q6Var.a * 16) + 17, -1, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.z6, null);
                textView.setSingleLine(false);
                textView.setText(q6Var.b);
                u2Var.addView(textView, c8.ma.t(-1, -2, 1, 6, 4, 24, 4));
                addView(u2Var, c8.ma.o(-1, -2));
            }
            int i13 = org.telegram.ui.ActionBar.m6.d6;
            View w3Var2 = new w3(getContext(), 12, 1);
            w3Var2.setBackground(null);
            org.telegram.ui.ActionBar.t6.h(i13, w3Var2, null);
            addView(w3Var2, c8.ma.o(-1, -2));
            Drawable Y0 = org.telegram.ui.ActionBar.m6.Y0(getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
            View w3Var3 = new w3(getContext(), 12, 1);
            w3Var3.setBackground(Y0);
            addView(w3Var3, c8.ma.o(-1, -2));
        }
    }
}
