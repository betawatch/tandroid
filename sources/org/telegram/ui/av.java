package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class av extends org.telegram.ui.Components.qa {
    public final zu T;
    public final s6 U;
    public final i6 V;
    public l6 W;
    public final org.telegram.ui.Components.lx0[] X;
    public final org.telegram.ui.Cells.y1[] Y;
    public final LinearLayout Z;
    public final w6 a0;
    public final long b0;
    public final ih.b c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    public av(z6 z6Var, s6 s6Var, ih.b bVar, i6 i6Var) {
        super(z6Var.getParentActivity(), z6Var, false, false, !bVar.h(), 1, null);
        String string;
        int i10;
        long j10;
        long j11;
        ?? r11 = 1;
        int i11 = 8;
        this.X = new org.telegram.ui.Components.lx0[8];
        this.Y = new org.telegram.ui.Cells.y1[8];
        this.V = i6Var;
        this.U = s6Var;
        this.c0 = bVar;
        this.b0 = s6Var.a;
        this.allowNestedScroll = false;
        N();
        setAllowNestedScroll(true);
        this.v = 0.2f;
        Activity parentActivity = z6Var.getParentActivity();
        fixNavigationBar();
        setApplyBottomPadding(false);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.Z = linearLayout;
        linearLayout.setOrientation(1);
        zu zuVar = new zu(getContext(), s6Var.a, i6Var);
        this.T = zuVar;
        linearLayout.addView(zuVar, h7.z5.t(-2, -2, 1, 0, 16, 0, 16));
        org.telegram.ui.Cells.y1 y1Var = null;
        int i12 = 0;
        while (i12 < i11) {
            if (i12 == 0) {
                string = LocaleController.getString(R.string.LocalPhotoCache);
                i10 = org.telegram.ui.ActionBar.g6.lj;
            } else if (i12 == r11) {
                string = LocaleController.getString(R.string.LocalVideoCache);
                i10 = org.telegram.ui.ActionBar.g6.hj;
            } else if (i12 == 2) {
                string = LocaleController.getString(R.string.LocalDocumentCache);
                i10 = org.telegram.ui.ActionBar.g6.ij;
            } else if (i12 == 3) {
                string = LocaleController.getString(R.string.LocalMusicCache);
                i10 = org.telegram.ui.ActionBar.g6.jj;
            } else if (i12 == 4) {
                string = LocaleController.getString(R.string.LocalAudioCache);
                i10 = org.telegram.ui.ActionBar.g6.mj;
            } else if (i12 == 5) {
                string = LocaleController.getString(R.string.LocalStickersCache);
                i10 = org.telegram.ui.ActionBar.g6.nj;
            } else if (i12 == 7) {
                string = LocaleController.getString(R.string.LocalStoriesCache);
                i10 = org.telegram.ui.ActionBar.g6.oj;
            } else {
                string = LocaleController.getString(R.string.LocalMiscellaneousCache);
                i10 = org.telegram.ui.ActionBar.g6.pj;
            }
            t6 t6Var = (t6) s6Var.d.get(i12);
            if (t6Var != null) {
                j10 = 0;
                j11 = t6Var.a;
            } else {
                j10 = 0;
                j11 = 0;
            }
            if (j11 > j10) {
                org.telegram.ui.Components.lx0[] lx0VarArr = this.X;
                org.telegram.ui.Components.lx0 lx0Var = new org.telegram.ui.Components.lx0();
                Paint paint = new Paint((int) r11);
                lx0Var.b = paint;
                lx0Var.c = r11;
                lx0Var.d = false;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeJoin(Paint.Join.ROUND);
                lx0VarArr[i12] = lx0Var;
                org.telegram.ui.Components.lx0 lx0Var2 = this.X[i12];
                lx0Var2.e = j11;
                lx0Var2.a = i10;
                org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, parentActivity, null, false);
                y1Var2.setTag(Integer.valueOf(i12));
                y1Var2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                this.Z.addView(y1Var2, h7.z5.n(-1, 50));
                y1Var2.e(string, AndroidUtilities.formatFileSize(j11), true, true, false);
                y1Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
                int i13 = org.telegram.ui.ActionBar.g6.k7;
                org.telegram.ui.Components.bp bpVar = y1Var2.r;
                if (bpVar != null) {
                    bpVar.b(i10, i10, i13);
                }
                y1Var2.setOnClickListener(new org.telegram.ui.Components.xh0(17, this, bVar));
                this.Y[i12] = y1Var2;
                y1Var = y1Var2;
            } else {
                this.X[i12] = null;
                this.Y[i12] = null;
            }
            i12++;
            i11 = 8;
            r11 = 1;
        }
        if (y1Var != null) {
            y1Var.setNeedDivider(false);
        }
        zu zuVar2 = this.T;
        org.telegram.ui.Components.lx0[] lx0VarArr2 = this.X;
        zuVar2.b = lx0VarArr2;
        zuVar2.B = bVar;
        zuVar2.invalidate();
        zuVar2.c = new float[lx0VarArr2.length];
        zuVar2.d = new float[lx0VarArr2.length];
        zuVar2.e = new float[lx0VarArr2.length];
        zuVar2.c(false);
        if (zuVar2.y > 1) {
            zuVar2.f = 0.0f;
        } else {
            zuVar2.f = 1.0f;
        }
        w6 w6Var = new w6(this, getContext(), z6Var, 1);
        this.a0 = w6Var;
        w6Var.setBottomPadding(AndroidUtilities.dp(80.0f));
        w6Var.setCacheModel(bVar);
        w6Var.setDelegate(new i6(6, this, bVar));
        org.telegram.ui.Components.la laVar = this.s;
        if (laVar != null) {
            laVar.setChildLayout(w6Var);
        } else {
            R();
            this.Z.addView(this.W, h7.z5.q(-1, 72, 80));
        }
        if (this.W != null) {
            this.W.a(this.T.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.qa
    public final void G(org.telegram.ui.Components.zu0 zu0Var) {
        this.d.j(new m3(this, 9));
        if (this.s != null) {
            R();
            zu0Var.addView(this.W, h7.z5.e(-1, 72, 80));
        }
    }

    public final void R() {
        l6 l6Var = new l6(getContext());
        this.W = l6Var;
        l6Var.a.setOnClickListener(new a(this, 19));
        zu zuVar = this.T;
        if (zuVar != null) {
            this.W.a(zuVar.a(), true);
        }
    }

    @Override // org.telegram.ui.Components.qa
    public final org.telegram.ui.Components.yk0 w(org.telegram.ui.Components.zk0 zk0Var) {
        return new yu(this);
    }

    @Override // org.telegram.ui.Components.qa
    public final CharSequence z() {
        return this.n.getMessagesController().getFullName(this.b0);
    }
}
