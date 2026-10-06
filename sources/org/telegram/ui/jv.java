package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class jv extends org.telegram.ui.Components.cb {
    public final iv X;
    public final u6 Y;
    public final o0.a Z;
    public n6 a0;
    public final org.telegram.ui.Components.yy0[] b0;
    public final org.telegram.ui.Cells.a2[] c0;
    public final LinearLayout d0;
    public final k6 e0;
    public final long f0;
    public final zh.b g0;

    public jv(a7 a7Var, u6 u6Var, zh.b bVar, o0.a aVar) {
        super((org.telegram.ui.ActionBar.n2) a7Var, false, !bVar.h(), (org.telegram.ui.ActionBar.d6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.b0 = new org.telegram.ui.Components.yy0[8];
        this.c0 = new org.telegram.ui.Cells.a2[8];
        this.Z = aVar;
        this.Y = u6Var;
        this.g0 = bVar;
        this.f0 = u6Var.a;
        this.allowNestedScroll = false;
        L();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = a7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.d0 = linearLayout;
        linearLayout.setOrientation(1);
        iv ivVar = new iv(getContext(), u6Var.a, aVar);
        this.X = ivVar;
        linearLayout.addView(ivVar, w7.z5.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.a2 a2Var = null;
        int i11 = 0;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.i6.lj;
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.i6.hj;
            } else if (i11 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.i6.ij;
            } else if (i11 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.i6.jj;
            } else if (i11 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.i6.mj;
            } else if (i11 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.i6.nj;
            } else if (i11 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.i6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.i6.pj;
            }
            String str = string;
            int i13 = i10;
            v6 v6Var = (v6) u6Var.d.get(i11);
            if (v6Var != null) {
                j3 = 0;
                j10 = v6Var.a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.yy0[] yy0VarArr = this.b0;
                org.telegram.ui.Components.yy0 yy0Var = new org.telegram.ui.Components.yy0();
                Paint paint = new Paint(1);
                yy0Var.b = paint;
                yy0Var.c = true;
                yy0Var.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                yy0VarArr[i11] = yy0Var;
                org.telegram.ui.Components.yy0 yy0Var2 = this.b0[i11];
                yy0Var2.e = j10;
                yy0Var2.a = i13;
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, parentActivity, null, false);
                a2Var2.setTag(Integer.valueOf(i11));
                a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(false));
                this.d0.addView(a2Var2, w7.z5.n(-1, 50));
                a2Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                a2Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.j5, false));
                int i14 = org.telegram.ui.ActionBar.i6.k7;
                org.telegram.ui.Components.qp qpVar = a2Var2.r;
                if (qpVar != null) {
                    qpVar.b(i13, i13, i14);
                }
                a2Var2.setOnClickListener(new org.telegram.ui.Components.gt(29, this, bVar));
                this.c0[i11] = a2Var2;
                a2Var = a2Var2;
            } else {
                this.b0[i11] = null;
                this.c0[i11] = null;
            }
            i11++;
        }
        if (a2Var != null) {
            a2Var.setNeedDivider(false);
        }
        iv ivVar2 = this.X;
        org.telegram.ui.Components.yy0[] yy0VarArr2 = this.b0;
        ivVar2.b = yy0VarArr2;
        ivVar2.F = bVar;
        ivVar2.invalidate();
        ivVar2.c = new float[yy0VarArr2.length];
        ivVar2.d = new float[yy0VarArr2.length];
        ivVar2.e = new float[yy0VarArr2.length];
        ivVar2.c(false);
        if (ivVar2.y > 1) {
            ivVar2.f = 0.0f;
        } else {
            ivVar2.f = 1.0f;
        }
        k6 k6Var = new k6(this, getContext(), a7Var);
        this.e0 = k6Var;
        int dp = AndroidUtilities.dp(80.0f);
        if (k6Var.v == null) {
            k6Var.s = dp;
            int i15 = 0;
            while (true) {
                org.telegram.ui.Components.h91 h91Var = k6Var.h;
                if (i15 >= h91Var.getViewPages().length) {
                    break;
                }
                org.telegram.ui.Components.zl0 c10 = v7.c(h91Var.getViewPages()[i15]);
                if (c10 != null) {
                    c10.setPadding(c10.getPaddingLeft(), 0, c10.getPaddingRight(), dp);
                }
                i15++;
            }
        }
        this.e0.setCacheModel(bVar);
        this.e0.setDelegate(new o0.a(this, bVar, false, 5));
        org.telegram.ui.Components.wa waVar = this.s;
        if (waVar != null) {
            waVar.setChildLayout(this.e0);
        } else {
            P();
            this.d0.addView(this.a0, w7.z5.q(-1, 72, 80));
        }
        if (this.a0 != null) {
            this.a0.a(this.X.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.cb
    public final void E(org.telegram.ui.Components.mw0 mw0Var) {
        this.d.j(new i3(this, 10));
        if (this.s != null) {
            P();
            mw0Var.addView(this.a0, w7.z5.e(-1, 72, 80));
        }
    }

    public final void P() {
        n6 n6Var = new n6(getContext());
        this.a0 = n6Var;
        n6Var.a.setOnClickListener(new a(this, 19));
        iv ivVar = this.X;
        if (ivVar != null) {
            this.a0.a(ivVar.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.cb
    public final org.telegram.ui.Components.yl0 v(org.telegram.ui.Components.zl0 zl0Var) {
        return new hv(this);
    }

    @Override // org.telegram.ui.Components.cb
    public final CharSequence y() {
        return this.n.getMessagesController().getFullName(this.f0);
    }
}
