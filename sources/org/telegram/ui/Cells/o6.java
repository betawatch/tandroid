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
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o6 extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public TLRPC.RequestPeerType a;
    public ArrayList b;

    public final void a(Boolean bool, int i7, int i10) {
        ArrayList arrayList = this.b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(p6.a(org.telegram.messenger.g0.X2(id.M0(i7, null))));
            } else {
                arrayList.add(p6.a(org.telegram.messenger.g0.X2(id.M0(i10, null))));
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
                a(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, 2131747339, 2131747340);
            } else {
                boolean z9 = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z9) {
                    a(requestPeerType.has_username, 2131747347, 2131747348);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(p6.a(org.telegram.messenger.g0.X2(id.M0(2131747350, null))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(p6.a(org.telegram.messenger.g0.X2(id.M0(2131747349, null))));
                    }
                } else {
                    a(requestPeerType.has_username, 2131747341, 2131747342);
                    a(requestPeerType.forum, 2131747345, 2131747346);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(p6.a(org.telegram.messenger.g0.X2(id.M0(2131747344, null))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(p6.a(org.telegram.messenger.g0.X2(id.M0(2131747343, null))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.M0(2131747337, null));
                    SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(id.M0(2131747338, null));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            f1.p(1, z9 ? id.M0(2131751324, null) : id.M0(2131751323, null), arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z9) {
                            f1.p(1, id.M0(2131751312, null), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z9) {
                            f1.p(1, id.M0(2131751319, null), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            f1.p(1, id.M0(z9 ? 2131751321 : 2131751316, null), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z9) {
                            f1.p(1, id.M0(2131751328, null), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            f1.p(1, id.M0(2131751330, null), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z9) {
                            f1.p(1, id.M0(2131751313, null), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            f1.p(1, id.M0(2131751331, null), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z9) {
                            f1.p(1, id.M0(2131751303, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            f1.p(1, id.M0(2131744901, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z9) {
                            f1.p(1, id.M0(2131748692, null), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(p6.a(TextUtils.concat(X22, " ", ((p6) arrayList2.get(0)).b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(X2);
                            valueOf.append((CharSequence) " ");
                            for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                                if (i7 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((p6) arrayList2.get(i7)).b.toString().toLowerCase());
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
            n4Var.setText(id.M0(2131747336, null));
            int i10 = org.telegram.ui.ActionBar.m6.d6;
            org.telegram.ui.ActionBar.t6.h(i10, n4Var, null);
            addView(n4Var, c8.ha.o(-1, -2));
            View v3Var = new v3(getContext(), 9, 1);
            v3Var.setBackground(null);
            org.telegram.ui.ActionBar.t6.h(i10, v3Var, null);
            addView(v3Var, c8.ha.o(-1, -2));
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                p6 p6Var = (p6) obj;
                Context context = getContext();
                bi.t tVar = new bi.t(context, 2);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, tVar, null);
                tVar.setOrientation(0);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(p6Var.a <= 0 ? R.drawable.list_check : R.drawable.list_circle);
                org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.L6, null, PorterDuff.Mode.MULTIPLY);
                tVar.addView(imageView, c8.ha.q(20, 20, 0.0f, 51, (p6Var.a * 16) + 17, -1, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.z6, null);
                textView.setSingleLine(false);
                textView.setText(p6Var.b);
                tVar.addView(textView, c8.ha.t(-1, -2, 1, 6, 4, 24, 4));
                addView(tVar, c8.ha.o(-1, -2));
            }
            int i12 = org.telegram.ui.ActionBar.m6.d6;
            View v3Var2 = new v3(getContext(), 12, 1);
            v3Var2.setBackground(null);
            org.telegram.ui.ActionBar.t6.h(i12, v3Var2, null);
            addView(v3Var2, c8.ha.o(-1, -2));
            Drawable Y0 = org.telegram.ui.ActionBar.m6.Y0(getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
            View v3Var3 = new v3(getContext(), 12, 1);
            v3Var3.setBackground(Y0);
            addView(v3Var3, c8.ha.o(-1, -2));
        }
    }
}
