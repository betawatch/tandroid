package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.jw0;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s2 extends FrameLayout {
    public final y0 a;
    public r2 b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public s2(Activity activity, y0 y0Var) {
        super(activity);
        this.a = y0Var;
        setWillNotDraw(true);
        r2 r2Var = new r2(activity, y0Var);
        this.b = r2Var;
        addView(r2Var, b6.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, b6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, b6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        this.b.a = new ci0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b = new ci0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        r2 r2Var = new r2(getContext(), this.a);
        if (i10 == R.raw.camera_flip2) {
            ci0 ci0Var = new ci0(i10, i11, i11, true, null);
            r2Var.c = ci0Var;
            ci0Var.R(r2Var);
        } else {
            r2Var.a = new ci0(i10, i11, i11, true, null);
            ci0 ci0Var2 = new ci0(i10, i11, i11, true, null);
            r2Var.b = ci0Var2;
            ci0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        r2Var.a(i12, z10, false);
        r2Var.setAlpha(0.0f);
        r2Var.setOnBtnClickedListener(this.b.y);
        addView(r2Var, b6.a(53.5f, 53.5f, 1));
        r2 r2Var2 = this.b;
        this.b = r2Var;
        r2Var.animate().alpha(1.0f).setDuration(250L).start();
        r2Var2.animate().alpha(0.0f).setDuration(250L).setListener(new jw0(2, (Object) this, (Object) r2Var2)).start();
    }

    public final void c(int i10) {
        this.b.a = new ci0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.b.b = new ci0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, boolean z10, boolean z11) {
        boolean z12;
        String L0;
        TextView textView;
        int visibility;
        TextView textView2;
        if (this.c == i10 && z10 == this.b.w) {
            if (getVisibility() != 0) {
                setVisibility(0);
                return;
            }
            return;
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        int L = org.telegram.messenger.i0.L(53.5f);
        int c10 = m1.j.c(i10);
        if (c10 != 0) {
            if (c10 == 1) {
                int i11 = this.c;
                if (i11 == 5 || i11 == 4) {
                    b(R.raw.camera_flip2, L, i10, z10);
                    z12 = true;
                } else if (i11 != 2) {
                    this.b.c = new ci0(R.raw.camera_flip2, L, L, true, null);
                    r2 r2Var = this.b;
                    r2Var.c.R(r2Var);
                }
            } else if (c10 != 2) {
                if (c10 == 3) {
                    int i12 = this.c;
                    if (i12 == 5) {
                        r2 r2Var2 = this.b;
                        z12 = z10 == r2Var2.w;
                        ci0 ci0Var = z10 ? r2Var2.b : r2Var2.a;
                        ci0Var.R(r2Var2);
                        ci0Var.t0 = new n2(this, L, 1);
                        ci0Var.start();
                    } else if (i12 == 2) {
                        b(R.raw.bt_to_speaker, L, i10, z10);
                        z12 = true;
                    } else if (i12 != 4) {
                        a(L);
                    }
                } else if (c10 == 4) {
                    int i13 = this.c;
                    if (i13 == 4) {
                        r2 r2Var3 = this.b;
                        z12 = z10 == r2Var3.w;
                        ci0 ci0Var2 = z10 ? r2Var3.b : r2Var3.a;
                        ci0Var2.R(r2Var3);
                        ci0Var2.t0 = new n2(this, L, 0);
                        ci0Var2.start();
                    } else if (i13 == 2) {
                        b(R.raw.speaker_to_bt, L, i10, z10);
                        z12 = true;
                    } else if (i13 != 5) {
                        c(L);
                    }
                }
            } else if (this.c != 3) {
                this.b.a = new ci0(R.raw.video_stop, L, L, true, null);
                this.b.b = new ci0(R.raw.video_stop, L, L, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                r2 r2Var4 = this.b;
                r2Var4.b.R(r2Var4);
            }
            if (!z12) {
                this.b.a(i10, z10, (this.c == 0 || z11) ? false : true);
            }
            int c11 = m1.j.c(i10);
            L0 = c11 == 0 ? c11 != 1 ? c11 != 2 ? c11 != 3 ? c11 != 4 ? "" : dd.L0(2131743265, null) : dd.L0(2131743529, null) : z10 ? dd.L0(2131743264, null) : dd.L0(2131743263, null) : dd.L0(2131743432, null) : z10 ? dd.L0(2131743256, null) : dd.L0(2131743319, null);
            setContentDescription(L0);
            textView = this.d;
            visibility = textView.getVisibility();
            textView2 = this.e;
            if (visibility != 8 && textView2.getVisibility() == 8) {
                textView.setVisibility(0);
                textView.setText(L0);
                textView2.setText(L0);
            } else if (textView2.getText().equals(L0) || !textView.getText().equals(L0)) {
                textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(4.0f)).setDuration(140L).setListener(new jw0(1, (Object) this, (Object) L0)).start();
                textView2.setText(L0);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(org.telegram.messenger.i0.L(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new i2(this, 1)).start();
            }
            this.c = i10;
        }
        if (this.c != 1) {
            this.b.a = new ci0(R.raw.call_mute, L, L, true, null);
            this.b.b = new ci0(R.raw.call_mute, L, L, true, null);
            this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            r2 r2Var5 = this.b;
            r2Var5.b.R(r2Var5);
        }
        z12 = false;
        if (!z12) {
        }
        int c112 = m1.j.c(i10);
        if (c112 == 0) {
        }
        setContentDescription(L0);
        textView = this.d;
        visibility = textView.getVisibility();
        textView2 = this.e;
        if (visibility != 8) {
        }
        if (textView2.getText().equals(L0)) {
        }
        textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(4.0f)).setDuration(140L).setListener(new jw0(1, (Object) this, (Object) L0)).start();
        textView2.setText(L0);
        textView2.setVisibility(0);
        textView2.setAlpha(0.0f);
        textView2.setTranslationY(org.telegram.messenger.i0.L(5.0f));
        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new i2(this, 1)).start();
        this.c = i10;
    }

    public void setOnBtnClickedListener(q2 q2Var) {
        this.b.setOnBtnClickedListener(q2Var);
    }
}
