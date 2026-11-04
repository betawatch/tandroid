package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ga0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TLRPC.Chat chat;
        int i3;
        int i10 = this.a;
        final int i11 = 1;
        boolean z10 = false;
        Object[] objArr = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ia0 ia0Var = (ia0) obj;
                ia0.b(ia0Var.getContext(), ia0Var.a, ia0Var.n, false, ia0Var.y, new gp(ia0Var, 27), ia0Var.c);
                break;
            case 1:
                ((hb0) obj).onBackPressed();
                break;
            case 2:
                hc0.I0((hc0) obj);
                break;
            case 3:
                org.telegram.ui.n4 n4Var = (org.telegram.ui.n4) obj;
                n4Var.getClass();
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                int intValue = ((Integer) r5Var.getTag()).intValue();
                nd0 nd0Var = (nd0) n4Var.e;
                if (intValue == nd0Var.E) {
                    nd0Var.O = r5Var.getCurrentColor();
                } else {
                    nd0Var.P = r5Var.getCurrentColor();
                }
                py pyVar = nd0Var.m0;
                if (pyVar != null) {
                    pyVar.c(false, false, false);
                }
                nd0Var.d();
                break;
            case 4:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((td0) obj).a.E.url)));
                break;
            case 5:
                ie0 ie0Var = (ie0) obj;
                PhotoViewer photoViewer = ie0Var.W;
                if (photoViewer != null) {
                    ud0 ud0Var = ie0Var.r;
                    if (ud0Var == null) {
                        m51 m51Var = photoViewer.G2;
                        if (m51Var != null) {
                            if (m51Var.d0()) {
                                m51Var.g0();
                            } else {
                                m51Var.h0();
                            }
                        }
                    } else if (ud0Var.H) {
                        ud0Var.f();
                    } else {
                        ud0Var.g();
                    }
                    ie0.q0.z();
                    break;
                }
                break;
            case 6:
                qe0 qe0Var = (qe0) obj;
                qe0Var.getClass();
                ne0 ne0Var = (ne0) qe0Var;
                oe0 oe0Var = ne0Var.e;
                re0 re0Var = (re0) ne0Var.getTag(R.id.object_tag);
                if (re0Var.b.size() > 15) {
                    boolean z11 = re0Var.e;
                    re0Var.e = !z11;
                    if (!z11) {
                        re0Var.f = 10;
                    }
                    oe0Var.s.J0(ne0Var);
                    oe0Var.s.k1.X(true);
                    break;
                }
                break;
            case 7:
                ((nk0) obj).onBackPressed();
                break;
            case 8:
                hl0 hl0Var = (hl0) ((ci.r4) obj).d;
                Activity activity = hl0Var.G;
                org.telegram.ui.ActionBar.d2 d2Var = hl0Var.H;
                int i12 = org.telegram.ui.q6.k1;
                if (d2Var != null && activity != null) {
                    final org.telegram.ui.q6 q6Var = new org.telegram.ui.q6(i11, activity, z10);
                    q6Var.w0 = false;
                    q6Var.v0 = false;
                    int i13 = org.telegram.ui.ActionBar.k6.d6;
                    q6Var.P(i13);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, q6Var.J0), 1, -1));
                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.xj, q6Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setImageResource(R.drawable.ic_layer_close);
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    imageView.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.gs
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (objArr2) {
                                case 0:
                                    q6Var.dismiss();
                                    break;
                                default:
                                    org.telegram.ui.q6 q6Var2 = q6Var;
                                    q6Var2.dismiss();
                                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(q6Var2.a);
                                    q10.I.clear();
                                    q10.getNotificationCenter().k(org.telegram.messenger.hs.b5, new Object[0]);
                                    q10.getMessagesStorage().a.c(new org.telegram.messenger.w5(q10, 2));
                                    break;
                            }
                        }
                    });
                    int L = org.telegram.messenger.g0.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, b8.mf.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    av0 av0Var = new av0(activity, q6Var.a);
                    av0Var.setStickerNum(9);
                    av0Var.getImageReceiver().W(1);
                    linearLayout.addView(av0Var, b8.mf.t(org.telegram.messenger.hs.v1, org.telegram.messenger.hs.v1, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i14 = org.telegram.ui.ActionBar.k6.j5;
                    org.telegram.ui.ActionBar.r6.V(textView, i14, null);
                    k2.p1.u(textView, 1, 20.0f, null, 2131751347);
                    linearLayout.addView(textView, b8.mf.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.V(textView2, i14, null);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    textView2.setText(org.telegram.messenger.bd.a0("DownloadedFilesMessage", null, 2131751346, new Object[0]));
                    linearLayout.addView(textView2, b8.mf.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
                    TextView textView3 = new TextView(activity);
                    textView3.setGravity(17);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView3.setEllipsize(truncateAt);
                    textView3.setSingleLine(true);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setText(org.telegram.messenger.bd.M0(2131748705, null));
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Gi, null);
                    int L2 = org.telegram.messenger.g0.L(8.0f);
                    int i15 = org.telegram.ui.ActionBar.k6.Ci;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, i15, false);
                    int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i13, false), 120);
                    org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, x02, o10, o10);
                    org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i15);
                    org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i13, 120);
                    textView3.setBackground(k02);
                    org.telegram.ui.ActionBar.r6.k(textView3, k02, N, h, null);
                    linearLayout.addView(textView3, b8.mf.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setText(org.telegram.messenger.bd.M0(2131752093, null));
                    org.telegram.ui.ActionBar.r6.V(textView4, i15, null);
                    int L3 = org.telegram.messenger.g0.L(8.0f);
                    int o11 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i15, false), 120);
                    org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.k6.k0(L3, L3, L3, L3, 0, o11, o11);
                    org.telegram.ui.ActionBar.n6 h7 = org.telegram.ui.ActionBar.r6.h(i15, 120);
                    textView4.setBackground(k03);
                    org.telegram.ui.ActionBar.r6.k(textView4, k03, null, h7, null);
                    textView4.setLetterSpacing(0.025f);
                    linearLayout.addView(textView4, b8.mf.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
                    NestedScrollView nestedScrollView = new NestedScrollView(activity);
                    nestedScrollView.addView(frameLayout);
                    q6Var.O = nestedScrollView;
                    textView3.setOnClickListener(new q2(14, q6Var, d2Var));
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.gs
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i11) {
                                case 0:
                                    q6Var.dismiss();
                                    break;
                                default:
                                    org.telegram.ui.q6 q6Var2 = q6Var;
                                    q6Var2.dismiss();
                                    org.telegram.messenger.z5 q10 = org.telegram.messenger.z5.q(q6Var2.a);
                                    q10.I.clear();
                                    q10.getNotificationCenter().k(org.telegram.messenger.hs.b5, new Object[0]);
                                    q10.getMessagesStorage().a.c(new org.telegram.messenger.w5(q10, 2));
                                    break;
                            }
                        }
                    });
                    q6Var.show();
                    break;
                }
                break;
            case 9:
                bh.g gVar = ((il0) obj).d;
                gVar.setText("");
                org.telegram.messenger.g0.K3(gVar);
                break;
            case 10:
                tl0 tl0Var = (tl0) obj;
                tl0Var.getClass();
                new vg.v0(tl0Var.b, 24, true).show();
                break;
            case 11:
                ((im0) obj).R(false);
                break;
            case 12:
                ro0 ro0Var = (ro0) ((gi.i1) obj).w;
                ArrayList arrayList = ro0Var.s;
                if (!arrayList.isEmpty()) {
                    ro0Var.r = TextUtils.join(" ", arrayList).toString();
                    ro0Var.n = false;
                    ro0Var.d();
                    ro0Var.x = null;
                    if (ro0Var.b != 0) {
                        ro0Var.b = 0;
                        qo0 qo0Var = ro0Var.I;
                        if (qo0Var != null) {
                            ((org.telegram.ui.du) qo0Var).i(0);
                            break;
                        }
                    }
                }
                break;
            case 13:
                ws0 ws0Var = ((ir0) obj).f;
                org.telegram.ui.ActionBar.d2 d2Var2 = ws0Var.y1;
                if (d2Var2 != null && d2Var2.getParentLayout() != null) {
                    ((ActionBarLayout) ws0Var.y1.getParentLayout()).r();
                    break;
                }
                break;
            case 14:
                ((sp0) obj).run();
                break;
            case 15:
                ((zu0) obj).b.getImageReceiver().P0(false);
                break;
            case 16:
                org.telegram.messenger.g0.i3((ei.c5) obj, 100L);
                break;
            case 17:
                ((EditTextBoldCursor) obj).setText("");
                break;
            case 18:
                sz0 sz0Var = ((uz0) obj).b;
                sz0Var.setText("");
                org.telegram.messenger.g0.K3(sz0Var);
                break;
            case 19:
                ((d01) obj).b.getImageReceiver().P0(false);
                break;
            case 20:
                ((f21) obj).dismiss();
                break;
            case 21:
                org.telegram.ui.wm wmVar = ((org.telegram.ui.xj) obj).E;
                if (wmVar.getUserConfig().q() || ((chat = wmVar.e) != null && chat.autotranslation)) {
                    wmVar.getMessagesController().s7.K(wmVar.a(), !r2.B(r3));
                } else {
                    i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                    org.telegram.messenger.hp.s1(i3).d7.edit().putInt("dialog_show_translate_count" + wmVar.a(), 14).commit();
                    wmVar.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) wmVar, 13, false));
                }
                wmVar.vd(true);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().b(true);
                break;
        }
    }
}
