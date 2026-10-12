package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ov extends org.telegram.ui.Components.db {
    public final nv X;
    public final w6 Y;
    public final n6.o Z;
    public o6 a0;
    public final org.telegram.ui.Components.zy0[] b0;
    public final org.telegram.ui.Cells.a2[] c0;
    public final LinearLayout d0;
    public final a7 e0;
    public final long f0;
    public final ai.c g0;

    public ov(d7 d7Var, w6 w6Var, ai.c cVar, n6.o oVar) {
        super((org.telegram.ui.ActionBar.m2) d7Var, false, !cVar.h(), (org.telegram.ui.ActionBar.c6) null);
        String string;
        int i10;
        long j10;
        long j11;
        this.b0 = new org.telegram.ui.Components.zy0[8];
        this.c0 = new org.telegram.ui.Cells.a2[8];
        this.Z = oVar;
        this.Y = w6Var;
        this.g0 = cVar;
        this.f0 = w6Var.a;
        this.allowNestedScroll = false;
        O();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = d7Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.d0 = linearLayout;
        linearLayout.setOrientation(1);
        nv nvVar = new nv(getContext(), w6Var.a, oVar);
        this.X = nvVar;
        linearLayout.addView(nvVar, w7.a6.t(-2, -2, 1, 0, 16, 0, 16));
        int i11 = 0;
        org.telegram.ui.Cells.a2 a2Var = null;
        for (int i12 = 8; i11 < i12; i12 = 8) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.g6.lj;
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.g6.hj;
            } else if (i11 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.g6.ij;
            } else if (i11 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.g6.jj;
            } else if (i11 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.g6.mj;
            } else if (i11 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.g6.nj;
            } else if (i11 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.g6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.g6.pj;
            }
            String str = string;
            int i13 = i10;
            x6 x6Var = (x6) w6Var.d.get(i11);
            if (x6Var != null) {
                j10 = 0;
                j11 = x6Var.a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.zy0[] zy0VarArr = this.b0;
                org.telegram.ui.Components.zy0 zy0Var = new org.telegram.ui.Components.zy0();
                Paint paint = new Paint(1);
                zy0Var.e = paint;
                zy0Var.c = true;
                zy0Var.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                zy0VarArr[i11] = zy0Var;
                org.telegram.ui.Components.zy0 zy0Var2 = this.b0[i11];
                zy0Var2.a = j11;
                zy0Var2.b = i13;
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, parentActivity, null, false);
                a2Var2.setTag(Integer.valueOf(i11));
                a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.L0(false));
                this.d0.addView(a2Var2, w7.a6.n(-1, 50));
                a2Var2.e(str, AndroidUtilities.formatFileSize(j11), true, true, false);
                a2Var2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.j5, false));
                int i14 = org.telegram.ui.ActionBar.g6.k7;
                org.telegram.ui.Components.aq aqVar = a2Var2.r;
                if (aqVar != null) {
                    aqVar.b(i13, i13, i14);
                }
                a2Var2.setOnClickListener(new org.telegram.ui.Components.rt(29, this, cVar));
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
        nv nvVar2 = this.X;
        org.telegram.ui.Components.zy0[] zy0VarArr2 = this.b0;
        nvVar2.b = zy0VarArr2;
        nvVar2.F = cVar;
        nvVar2.invalidate();
        nvVar2.c = new float[zy0VarArr2.length];
        nvVar2.d = new float[zy0VarArr2.length];
        nvVar2.e = new float[zy0VarArr2.length];
        nvVar2.c(false);
        if (nvVar2.y > 1) {
            nvVar2.f = 0.0f;
        } else {
            nvVar2.f = 1.0f;
        }
        a7 a7Var = new a7(this, getContext(), d7Var, 1);
        this.e0 = a7Var;
        a7Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        a7Var.setCacheModel(cVar);
        a7Var.setDelegate(new m4.c(this, cVar, false, 13));
        org.telegram.ui.Components.xa xaVar = this.s;
        if (xaVar != null) {
            xaVar.setChildLayout(a7Var);
        } else {
            S();
            this.d0.addView(this.a0, w7.a6.q(-1, 72, 80));
        }
        if (this.a0 != null) {
            this.a0.a(this.X.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.db
    public final CharSequence A() {
        return this.n.getMessagesController().getFullName(this.f0);
    }

    @Override // org.telegram.ui.Components.db
    public final void H(org.telegram.ui.Components.ow0 ow0Var) {
        this.d.j(new k3(this, 9));
        if (this.s != null) {
            S();
            ow0Var.addView(this.a0, w7.a6.e(-1, 72, 80));
        }
    }

    public final void S() {
        o6 o6Var = new o6(getContext());
        this.a0 = o6Var;
        o6Var.a.setOnClickListener(new a(this, 18));
        nv nvVar = this.X;
        if (nvVar != null) {
            this.a0.a(nvVar.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.db
    public final org.telegram.ui.Components.lm0 x(org.telegram.ui.Components.mm0 mm0Var) {
        return new mv(this);
    }
}
