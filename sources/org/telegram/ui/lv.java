package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lv extends org.telegram.ui.Components.ab {
    public final kv X;
    public final r6 Y;
    public final n7.a1 Z;
    public l6 a0;
    public final org.telegram.ui.Components.oy0[] b0;
    public final org.telegram.ui.Cells.z1[] c0;
    public final LinearLayout d0;
    public final v6 e0;
    public final long f0;
    public final yh.b g0;

    public lv(y6 y6Var, r6 r6Var, yh.b bVar, n7.a1 a1Var) {
        super((org.telegram.ui.ActionBar.p2) y6Var, false, !bVar.h(), (org.telegram.ui.ActionBar.f6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.b0 = new org.telegram.ui.Components.oy0[8];
        this.c0 = new org.telegram.ui.Cells.z1[8];
        this.Z = a1Var;
        this.Y = r6Var;
        this.g0 = bVar;
        this.f0 = r6Var.a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = y6Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.d0 = linearLayout;
        linearLayout.setOrientation(1);
        kv kvVar = new kv(getContext(), r6Var.a, a1Var);
        this.X = kvVar;
        linearLayout.addView(kvVar, w7.a6.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.z1 z1Var = null;
        int i11 = 0;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.j6.lj;
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.j6.hj;
            } else if (i11 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.j6.ij;
            } else if (i11 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.j6.jj;
            } else if (i11 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.j6.mj;
            } else if (i11 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.j6.nj;
            } else if (i11 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.j6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.j6.pj;
            }
            String str = string;
            int i13 = i10;
            s6 s6Var = (s6) r6Var.d.get(i11);
            if (s6Var != null) {
                j3 = 0;
                j10 = s6Var.a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.oy0[] oy0VarArr = this.b0;
                org.telegram.ui.Components.oy0 oy0Var = new org.telegram.ui.Components.oy0();
                Paint paint = new Paint(1);
                oy0Var.b = paint;
                oy0Var.c = true;
                oy0Var.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                oy0VarArr[i11] = oy0Var;
                org.telegram.ui.Components.oy0 oy0Var2 = this.b0[i11];
                oy0Var2.e = j10;
                oy0Var2.a = i13;
                org.telegram.ui.Cells.z1 z1Var2 = new org.telegram.ui.Cells.z1(4, 21, parentActivity, null, false);
                z1Var2.setTag(Integer.valueOf(i11));
                z1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                this.d0.addView(z1Var2, w7.a6.n(-1, 50));
                z1Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                z1Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
                int i14 = org.telegram.ui.ActionBar.j6.k7;
                org.telegram.ui.Components.tp tpVar = z1Var2.r;
                if (tpVar != null) {
                    tpVar.b(i13, i13, i14);
                }
                z1Var2.setOnClickListener(new org.telegram.ui.Components.u10(26, this, bVar));
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
        kv kvVar2 = this.X;
        org.telegram.ui.Components.oy0[] oy0VarArr2 = this.b0;
        kvVar2.b = oy0VarArr2;
        kvVar2.F = bVar;
        kvVar2.invalidate();
        kvVar2.c = new float[oy0VarArr2.length];
        kvVar2.d = new float[oy0VarArr2.length];
        kvVar2.e = new float[oy0VarArr2.length];
        kvVar2.c(false);
        if (kvVar2.y > 1) {
            kvVar2.f = 0.0f;
        } else {
            kvVar2.f = 1.0f;
        }
        v6 v6Var = new v6(this, getContext(), y6Var, 1);
        this.e0 = v6Var;
        v6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        v6Var.setCacheModel(bVar);
        v6Var.setDelegate(new n7.a1(this, bVar, false, 7));
        org.telegram.ui.Components.ua uaVar = this.s;
        if (uaVar != null) {
            uaVar.setChildLayout(v6Var);
        } else {
            R();
            this.d0.addView(this.a0, w7.a6.q(-1, 72, 80));
        }
        if (this.a0 != null) {
            this.a0.a(this.X.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.ab
    public final void F(org.telegram.ui.Components.aw0 aw0Var) {
        this.d.j(new j3(this, 9));
        if (this.s != null) {
            R();
            aw0Var.addView(this.a0, w7.a6.e(-1, 72, 80));
        }
    }

    public final void R() {
        l6 l6Var = new l6(getContext());
        this.a0 = l6Var;
        l6Var.a.setOnClickListener(new a(this, 19));
        kv kvVar = this.X;
        if (kvVar != null) {
            this.a0.a(kvVar.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.ab
    public final org.telegram.ui.Components.ul0 v(org.telegram.ui.Components.vl0 vl0Var) {
        return new jv(this);
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return this.n.getMessagesController().getFullName(this.f0);
    }
}
