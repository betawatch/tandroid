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
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n6 extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public TLRPC.RequestPeerType a;
    public ArrayList b;

    public final void a(Boolean bool, int i3, int i10) {
        ArrayList arrayList = this.b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(o6.a(org.telegram.messenger.g0.X2(bd.M0(i3, null))));
            } else {
                arrayList.add(o6.a(org.telegram.messenger.g0.X2(bd.M0(i10, null))));
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
                a(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, 2131747347, 2131747348);
            } else {
                boolean z10 = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z10) {
                    a(requestPeerType.has_username, 2131747355, 2131747356);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(bd.M0(2131747358, null))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(bd.M0(2131747357, null))));
                    }
                } else {
                    a(requestPeerType.has_username, 2131747349, 2131747350);
                    a(requestPeerType.forum, 2131747353, 2131747354);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(bd.M0(2131747352, null))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(bd.M0(2131747351, null))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.M0(2131747345, null));
                    SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(bd.M0(2131747346, null));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            f1.t(1, z10 ? bd.M0(2131751325, null) : bd.M0(2131751324, null), arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z10) {
                            f1.t(1, bd.M0(2131751313, null), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z10) {
                            f1.t(1, bd.M0(2131751320, null), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            f1.t(1, bd.M0(z10 ? 2131751322 : 2131751317, null), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z10) {
                            f1.t(1, bd.M0(2131751329, null), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            f1.t(1, bd.M0(2131751331, null), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z10) {
                            f1.t(1, bd.M0(2131751314, null), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            f1.t(1, bd.M0(2131751332, null), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z10) {
                            f1.t(1, bd.M0(2131751304, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            f1.t(1, bd.M0(2131744911, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z10) {
                            f1.t(1, bd.M0(2131748700, null), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(o6.a(TextUtils.concat(X22, " ", ((o6) arrayList2.get(0)).b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(X2);
                            valueOf.append((CharSequence) " ");
                            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                if (i3 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((o6) arrayList2.get(i3)).b.toString().toLowerCase());
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
            n4Var.setText(bd.M0(2131747344, null));
            int i10 = org.telegram.ui.ActionBar.k6.d6;
            org.telegram.ui.ActionBar.r6.i(i10, n4Var, null);
            addView(n4Var, mf.o(-1, -2));
            View v3Var = new v3(getContext(), 9, 1);
            v3Var.setBackground(null);
            org.telegram.ui.ActionBar.r6.i(i10, v3Var, null);
            addView(v3Var, mf.o(-1, -2));
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                o6 o6Var = (o6) obj;
                Context context = getContext();
                ci.q qVar = new ci.q(context, 2);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, qVar, null);
                qVar.setOrientation(0);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(o6Var.a <= 0 ? R.drawable.list_check : R.drawable.list_circle);
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.L6, null, PorterDuff.Mode.MULTIPLY);
                qVar.addView(imageView, mf.q(20, 20, 0.0f, 51, (o6Var.a * 16) + 17, -1, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.z6, null);
                textView.setSingleLine(false);
                textView.setText(o6Var.b);
                qVar.addView(textView, mf.t(-1, -2, 1, 6, 4, 24, 4));
                addView(qVar, mf.o(-1, -2));
            }
            int i12 = org.telegram.ui.ActionBar.k6.d6;
            View v3Var2 = new v3(getContext(), 12, 1);
            v3Var2.setBackground(null);
            org.telegram.ui.ActionBar.r6.i(i12, v3Var2, null);
            addView(v3Var2, mf.o(-1, -2));
            Drawable Y0 = org.telegram.ui.ActionBar.k6.Y0(getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
            View v3Var3 = new v3(getContext(), 12, 1);
            v3Var3.setBackground(Y0);
            addView(v3Var3, mf.o(-1, -2));
        }
    }
}
