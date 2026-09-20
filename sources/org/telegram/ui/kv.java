package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class kv extends org.telegram.ui.Components.ab {
    public final jv X;
    public final s6 Y;
    public final m5.e Z;
    public l6 a0;
    public final org.telegram.ui.Components.ny0[] b0;
    public final org.telegram.ui.Cells.a2[] c0;
    public final LinearLayout d0;
    public final w6 e0;
    public final long f0;
    public final zh.b g0;

    public kv(z6 z6Var, s6 s6Var, zh.b bVar, m5.e eVar) {
        super((org.telegram.ui.ActionBar.n2) z6Var, false, !bVar.h(), (org.telegram.ui.ActionBar.f6) null);
        String string;
        int i10;
        long j3;
        long j10;
        this.b0 = new org.telegram.ui.Components.ny0[8];
        this.c0 = new org.telegram.ui.Cells.a2[8];
        this.Z = eVar;
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
        jv jvVar = new jv(getContext(), s6Var.a, eVar);
        this.X = jvVar;
        linearLayout.addView(jvVar, w7.y5.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.a2 a2Var = null;
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
            t6 t6Var = (t6) s6Var.d.get(i11);
            if (t6Var != null) {
                j3 = 0;
                j10 = t6Var.a;
            } else {
                j3 = 0;
                j10 = 0;
            }
            if (j10 > j3) {
                org.telegram.ui.Components.ny0[] ny0VarArr = this.b0;
                org.telegram.ui.Components.ny0 ny0Var = new org.telegram.ui.Components.ny0();
                Paint paint = new Paint(1);
                ny0Var.b = paint;
                ny0Var.c = true;
                ny0Var.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                ny0VarArr[i11] = ny0Var;
                org.telegram.ui.Components.ny0 ny0Var2 = this.b0[i11];
                ny0Var2.e = j10;
                ny0Var2.a = i13;
                org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(4, 21, parentActivity, null, false);
                a2Var2.setTag(Integer.valueOf(i11));
                a2Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(false));
                this.d0.addView(a2Var2, w7.y5.n(-1, 50));
                a2Var2.e(str, AndroidUtilities.formatFileSize(j10), true, true, false);
                a2Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
                int i14 = org.telegram.ui.ActionBar.j6.k7;
                org.telegram.ui.Components.np npVar = a2Var2.r;
                if (npVar != null) {
                    npVar.b(i13, i13, i14);
                }
                a2Var2.setOnClickListener(new org.telegram.ui.Components.dt(29, this, bVar));
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
        jv jvVar2 = this.X;
        org.telegram.ui.Components.ny0[] ny0VarArr2 = this.b0;
        jvVar2.b = ny0VarArr2;
        jvVar2.F = bVar;
        jvVar2.invalidate();
        jvVar2.c = new float[ny0VarArr2.length];
        jvVar2.d = new float[ny0VarArr2.length];
        jvVar2.e = new float[ny0VarArr2.length];
        jvVar2.c(false);
        if (jvVar2.y > 1) {
            jvVar2.f = 0.0f;
        } else {
            jvVar2.f = 1.0f;
        }
        w6 w6Var = new w6(this, getContext(), z6Var);
        this.e0 = w6Var;
        w6Var.c(0, AndroidUtilities.dp(80.0f));
        w6Var.setCacheModel(bVar);
        w6Var.setDelegate(new m5.e(this, bVar, false, 9));
        org.telegram.ui.Components.ua uaVar = this.s;
        if (uaVar != null) {
            uaVar.setChildLayout(w6Var);
        } else {
            R();
            this.d0.addView(this.a0, w7.y5.q(-1, 72, 80));
        }
        if (this.a0 != null) {
            this.a0.a(this.X.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.ab
    public final void G(org.telegram.ui.Components.aw0 aw0Var) {
        this.d.j(new h3(this, 9));
        if (this.s != null) {
            R();
            aw0Var.addView(this.a0, w7.y5.e(-1, 72, 80));
        }
    }

    public final void R() {
        l6 l6Var = new l6(getContext());
        this.a0 = l6Var;
        l6Var.a.setOnClickListener(new a(this, 19));
        jv jvVar = this.X;
        if (jvVar != null) {
            this.a0.a(jvVar.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.ab
    public final org.telegram.ui.Components.ul0 v(org.telegram.ui.Components.vl0 vl0Var) {
        return new iv(this);
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return this.n.getMessagesController().getFullName(this.f0);
    }
}
