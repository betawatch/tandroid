package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jv extends org.telegram.ui.Components.za {
    public final iv X;
    public final s6 Y;
    public final o0.a Z;
    public l6 a0;
    public final org.telegram.ui.Components.cy0[] b0;
    public final org.telegram.ui.Cells.z1[] c0;
    public final LinearLayout d0;
    public final w6 e0;
    public final long f0;
    public final zh.b g0;

    public jv(z6 z6Var, s6 s6Var, zh.b bVar, o0.a aVar) {
        super((org.telegram.ui.ActionBar.n2) z6Var, false, !bVar.h(), (org.telegram.ui.ActionBar.e6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.b0 = new org.telegram.ui.Components.cy0[8];
        this.c0 = new org.telegram.ui.Cells.z1[8];
        this.Z = aVar;
        this.Y = s6Var;
        this.g0 = bVar;
        this.f0 = s6Var.a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = z6Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.d0 = linearLayout;
        linearLayout.setOrientation(1);
        iv ivVar = new iv(getContext(), s6Var.a, aVar);
        this.X = ivVar;
        linearLayout.addView(ivVar, w7.x5.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.z1 z1Var = null;
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
            t6 t6Var = (t6) s6Var.d.get(i11);
            if (t6Var != null) {
                j3 = 0;
                j10 = t6Var.a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.cy0[] cy0VarArr = this.b0;
                org.telegram.ui.Components.cy0 cy0Var = new org.telegram.ui.Components.cy0();
                Paint paint = new Paint(1);
                cy0Var.b = paint;
                cy0Var.c = true;
                cy0Var.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                cy0VarArr[i11] = cy0Var;
                org.telegram.ui.Components.cy0 cy0Var2 = this.b0[i11];
                cy0Var2.e = j10;
                cy0Var2.a = i13;
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, parentActivity, null, false);
                z1Var2.setTag(Integer.valueOf(i11));
                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.K0(false));
                this.d0.addView(z1Var2, w7.x5.n(-1, 50));
                z1Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                z1Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.j5, false));
                int i14 = org.telegram.ui.ActionBar.i6.k7;
                org.telegram.ui.Components.np npVar = z1Var2.r;
                if (npVar != null) {
                    npVar.b(i13, i13, i14);
                }
                z1Var2.setOnClickListener(new org.telegram.ui.Components.dt(29, this, bVar));
                this.c0[i11] = z1Var2;
                z1Var = z1Var2;
            } else {
                this.b0[i11] = null;
                this.c0[i11] = null;
            }
            i11++;
        }
        if (z1Var != null) {
            z1Var.setNeedDivider(false);
        }
        iv ivVar2 = this.X;
        org.telegram.ui.Components.cy0[] cy0VarArr2 = this.b0;
        ivVar2.b = cy0VarArr2;
        ivVar2.F = bVar;
        ivVar2.invalidate();
        ivVar2.c = new float[cy0VarArr2.length];
        ivVar2.d = new float[cy0VarArr2.length];
        ivVar2.e = new float[cy0VarArr2.length];
        ivVar2.c(false);
        if (ivVar2.y > 1) {
            ivVar2.f = 0.0f;
        } else {
            ivVar2.f = 1.0f;
        }
        w6 w6Var = new w6(this, getContext(), z6Var, 1);
        this.e0 = w6Var;
        w6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        w6Var.setCacheModel(bVar);
        w6Var.setDelegate(new o0.a(this, bVar, false, 5));
        org.telegram.ui.Components.ta taVar = this.s;
        if (taVar != null) {
            taVar.setChildLayout(w6Var);
        } else {
            R();
            this.d0.addView(this.a0, w7.x5.q(-1, 72, 80));
        }
        if (this.a0 != null) {
            this.a0.a(this.X.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.za
    public final void G(org.telegram.ui.Components.pv0 pv0Var) {
        this.d.j(new h3(this, 9));
        if (this.s != null) {
            R();
            pv0Var.addView(this.a0, w7.x5.e(-1, 72, 80));
        }
    }

    public final void R() {
        l6 l6Var = new l6(getContext());
        this.a0 = l6Var;
        l6Var.a.setOnClickListener(new a(this, 19));
        iv ivVar = this.X;
        if (ivVar != null) {
            this.a0.a(ivVar.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.za
    public final org.telegram.ui.Components.kl0 v(org.telegram.ui.Components.ll0 ll0Var) {
        return new hv(this);
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        return this.n.getMessagesController().getFullName(this.f0);
    }
}
