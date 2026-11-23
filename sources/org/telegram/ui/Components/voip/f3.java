package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.na;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.nh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f3 extends FrameLayout {
    public final m1 a;
    public e3 b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public f3(Activity activity, m1 m1Var) {
        super(activity);
        this.a = m1Var;
        setWillNotDraw(true);
        e3 e3Var = new e3(activity, m1Var);
        this.b = e3Var;
        addView(e3Var, na.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, na.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, na.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i7) {
        this.b.a = new nh0(R.raw.bt_to_speaker, i7, i7, true, null);
        this.b.b = new nh0(R.raw.bt_to_speaker, i7, i7, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i7, int i10, int i11, boolean z10) {
        e3 e3Var = new e3(getContext(), this.a);
        if (i7 == R.raw.camera_flip2) {
            nh0 nh0Var = new nh0(i7, i10, i10, true, null);
            e3Var.c = nh0Var;
            nh0Var.R(e3Var);
        } else {
            e3Var.a = new nh0(i7, i10, i10, true, null);
            nh0 nh0Var2 = new nh0(i7, i10, i10, true, null);
            e3Var.b = nh0Var2;
            nh0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        e3Var.a(i11, z10, false);
        e3Var.setAlpha(0.0f);
        e3Var.setOnBtnClickedListener(this.b.y);
        addView(e3Var, na.a(53.5f, 53.5f, 1));
        e3 e3Var2 = this.b;
        this.b = e3Var;
        e3Var.animate().alpha(1.0f).setDuration(250L).start();
        e3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new f10(8, this, e3Var2)).start();
    }

    public final void c(int i7) {
        this.b.a = new nh0(R.raw.speaker_to_bt, i7, i7, true, null);
        this.b.b = new nh0(R.raw.speaker_to_bt, i7, i7, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i7, boolean z10, boolean z11) {
        boolean z12;
        String N0;
        TextView textView;
        int visibility;
        TextView textView2;
        if (this.c == i7 && z10 == this.b.w) {
            if (getVisibility() != 0) {
                setVisibility(0);
                return;
            }
            return;
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        int L = org.telegram.messenger.g0.L(53.5f);
        int c10 = p1.g.c(i7);
        if (c10 != 0) {
            if (c10 == 1) {
                int i10 = this.c;
                if (i10 == 5 || i10 == 4) {
                    b(R.raw.camera_flip2, L, i7, z10);
                    z12 = true;
                } else if (i10 != 2) {
                    this.b.c = new nh0(R.raw.camera_flip2, L, L, true, null);
                    e3 e3Var = this.b;
                    e3Var.c.R(e3Var);
                }
            } else if (c10 != 2) {
                if (c10 == 3) {
                    int i11 = this.c;
                    if (i11 == 5) {
                        e3 e3Var2 = this.b;
                        z12 = z10 == e3Var2.w;
                        nh0 nh0Var = z10 ? e3Var2.b : e3Var2.a;
                        nh0Var.R(e3Var2);
                        nh0Var.u0 = new a3(this, L, 1);
                        nh0Var.start();
                    } else if (i11 == 2) {
                        b(R.raw.bt_to_speaker, L, i7, z10);
                        z12 = true;
                    } else if (i11 != 4) {
                        a(L);
                    }
                } else if (c10 == 4) {
                    int i12 = this.c;
                    if (i12 == 4) {
                        e3 e3Var3 = this.b;
                        z12 = z10 == e3Var3.w;
                        nh0 nh0Var2 = z10 ? e3Var3.b : e3Var3.a;
                        nh0Var2.R(e3Var3);
                        nh0Var2.u0 = new a3(this, L, 0);
                        nh0Var2.start();
                    } else if (i12 == 2) {
                        b(R.raw.speaker_to_bt, L, i7, z10);
                        z12 = true;
                    } else if (i12 != 5) {
                        c(L);
                    }
                }
            } else if (this.c != 3) {
                this.b.a = new nh0(R.raw.video_stop, L, L, true, null);
                this.b.b = new nh0(R.raw.video_stop, L, L, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                e3 e3Var4 = this.b;
                e3Var4.b.R(e3Var4);
            }
            if (!z12) {
                this.b.a(i7, z10, (this.c == 0 || z11) ? false : true);
            }
            int c11 = p1.g.c(i7);
            N0 = c11 == 0 ? c11 != 1 ? c11 != 2 ? c11 != 3 ? c11 != 4 ? "" : gd.N0(2131742989, null) : gd.N0(2131743253, null) : z10 ? gd.N0(2131742988, null) : gd.N0(2131742987, null) : gd.N0(2131743156, null) : z10 ? gd.N0(2131742980, null) : gd.N0(2131743043, null);
            setContentDescription(N0);
            textView = this.d;
            visibility = textView.getVisibility();
            textView2 = this.e;
            if (visibility != 8 && textView2.getVisibility() == 8) {
                textView.setVisibility(0);
                textView.setText(N0);
                textView2.setText(N0);
            } else if (textView2.getText().equals(N0) || !textView.getText().equals(N0)) {
                textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(4.0f)).setDuration(140L).setListener(new f10(7, this, N0)).start();
                textView2.setText(N0);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(org.telegram.messenger.g0.L(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new x9(this, 21)).start();
            }
            this.c = i7;
        }
        if (this.c != 1) {
            this.b.a = new nh0(R.raw.call_mute, L, L, true, null);
            this.b.b = new nh0(R.raw.call_mute, L, L, true, null);
            this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            e3 e3Var5 = this.b;
            e3Var5.b.R(e3Var5);
        }
        z12 = false;
        if (!z12) {
        }
        int c112 = p1.g.c(i7);
        if (c112 == 0) {
        }
        setContentDescription(N0);
        textView = this.d;
        visibility = textView.getVisibility();
        textView2 = this.e;
        if (visibility != 8) {
        }
        if (textView2.getText().equals(N0)) {
        }
        textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(4.0f)).setDuration(140L).setListener(new f10(7, this, N0)).start();
        textView2.setText(N0);
        textView2.setVisibility(0);
        textView2.setAlpha(0.0f);
        textView2.setTranslationY(org.telegram.messenger.g0.L(5.0f));
        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new x9(this, 21)).start();
        this.c = i7;
    }

    public void setOnBtnClickedListener(d3 d3Var) {
        this.b.setOnBtnClickedListener(d3Var);
    }
}
