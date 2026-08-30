package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gv extends org.telegram.ui.Components.sa {
    public final fv U;
    public final u6 V;
    public final n7.qa W;
    public o6 X;
    public final org.telegram.ui.Components.ey0[] Y;
    public final org.telegram.ui.Cells.z1[] Z;
    public final LinearLayout a0;
    public final y6 b0;
    public final long c0;
    public final mh.b d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    public gv(b7 b7Var, u6 u6Var, mh.b bVar, n7.qa qaVar) {
        super(b7Var.getParentActivity(), b7Var, false, false, !bVar.h(), 1, null);
        String string;
        int i10;
        long j10;
        long j11;
        ?? r11 = 1;
        int i11 = 8;
        this.Y = new org.telegram.ui.Components.ey0[8];
        this.Z = new org.telegram.ui.Cells.z1[8];
        this.W = qaVar;
        this.V = u6Var;
        this.d0 = bVar;
        this.c0 = u6Var.a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = b7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.a0 = linearLayout;
        linearLayout.setOrientation(1);
        fv fvVar = new fv(getContext(), u6Var.a, qaVar);
        this.U = fvVar;
        linearLayout.addView(fvVar, k7.b6.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.z1 z1Var = null;
        int i12 = 0;
        while (i12 < i11) {
            if (i12 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.j6.lj;
            } else if (i12 == r11) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.j6.hj;
            } else if (i12 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.j6.ij;
            } else if (i12 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.j6.jj;
            } else if (i12 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.j6.mj;
            } else if (i12 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.j6.nj;
            } else if (i12 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.j6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.j6.pj;
            }
            v6 v6Var = (v6) u6Var.d.get(i12);
            if (v6Var != null) {
                j10 = 0;
                j11 = v6Var.a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.ey0[] ey0VarArr = this.Y;
                org.telegram.ui.Components.ey0 ey0Var = new org.telegram.ui.Components.ey0();
                Paint paint = new Paint((int) r11);
                ey0Var.b = paint;
                ey0Var.c = r11;
                ey0Var.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                ey0VarArr[i12] = ey0Var;
                org.telegram.ui.Components.ey0 ey0Var2 = this.Y[i12];
                ey0Var2.e = j11;
                ey0Var2.a = i10;
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, parentActivity, null, false);
                z1Var2.setTag(Integer.valueOf(i12));
                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                this.a0.addView(z1Var2, k7.b6.n(-1, 50));
                z1Var2.e(string, AndroidUtilities.formatFileSize(j11), true, true, false);
                z1Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
                int i13 = org.telegram.ui.ActionBar.j6.k7;
                org.telegram.ui.Components.lp lpVar = z1Var2.r;
                if (lpVar != null) {
                    lpVar.b(i10, i10, i13);
                }
                z1Var2.setOnClickListener(new org.telegram.ui.Components.rx0(14, this, bVar));
                this.Z[i12] = z1Var2;
                z1Var = z1Var2;
            } else {
                this.Y[i12] = null;
                this.Z[i12] = null;
            }
            i12++;
            i11 = 8;
            r11 = 1;
        }
        if (z1Var != null) {
            z1Var.setNeedDivider(false);
        }
        fv fvVar2 = this.U;
        org.telegram.ui.Components.ey0[] ey0VarArr2 = this.Y;
        fvVar2.b = ey0VarArr2;
        fvVar2.C = bVar;
        fvVar2.invalidate();
        fvVar2.c = new float[ey0VarArr2.length];
        fvVar2.d = new float[ey0VarArr2.length];
        fvVar2.e = new float[ey0VarArr2.length];
        fvVar2.c(false);
        if (fvVar2.y > 1) {
            fvVar2.f = 0.0f;
        } else {
            fvVar2.f = 1.0f;
        }
        y6 y6Var = new y6(this, getContext(), b7Var, 1);
        this.b0 = y6Var;
        y6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        y6Var.setCacheModel(bVar);
        y6Var.setDelegate(new n7.qa(15, this, bVar));
        org.telegram.ui.Components.na naVar = this.s;
        if (naVar != null) {
            naVar.setChildLayout(y6Var);
        } else {
            R();
            this.a0.addView(this.X, k7.b6.q(-1, 72, 80));
        }
        if (this.X != null) {
            this.X.a(this.U.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final void F(org.telegram.ui.Components.qv0 qv0Var) {
        this.d.j(new l3(this, 9));
        if (this.s != null) {
            R();
            qv0Var.addView(this.X, k7.b6.e(-1, 72, 80));
        }
    }

    public final void R() {
        o6 o6Var = new o6(getContext());
        this.X = o6Var;
        o6Var.a.setOnClickListener(new a(this, 19));
        fv fvVar = this.U;
        if (fvVar != null) {
            this.X.a(fvVar.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.rl0 v(org.telegram.ui.Components.sl0 sl0Var) {
        return new ev(this);
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return this.n.getMessagesController().getFullName(this.c0);
    }
}
