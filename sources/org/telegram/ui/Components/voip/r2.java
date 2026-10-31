package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.iw0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r2 extends FrameLayout {
    public final x0 a;
    public q2 b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public r2(Activity activity, x0 x0Var) {
        super(activity);
        this.a = x0Var;
        setWillNotDraw(true);
        q2 q2Var = new q2(activity, x0Var);
        this.b = q2Var;
        addView(q2Var, b6.a(53.5f, 53.5f, 1));
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
        this.b.a = new bi0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b = new bi0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        q2 q2Var = new q2(getContext(), this.a);
        if (i10 == R.raw.camera_flip2) {
            bi0 bi0Var = new bi0(i10, i11, i11, true, null);
            q2Var.c = bi0Var;
            bi0Var.R(q2Var);
        } else {
            q2Var.a = new bi0(i10, i11, i11, true, null);
            bi0 bi0Var2 = new bi0(i10, i11, i11, true, null);
            q2Var.b = bi0Var2;
            bi0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        q2Var.a(i12, z10, false);
        q2Var.setAlpha(0.0f);
        q2Var.setOnBtnClickedListener(this.b.y);
        addView(q2Var, b6.a(53.5f, 53.5f, 1));
        q2 q2Var2 = this.b;
        this.b = q2Var;
        q2Var.animate().alpha(1.0f).setDuration(250L).start();
        q2Var2.animate().alpha(0.0f).setDuration(250L).setListener(new iw0(2, (Object) this, (Object) q2Var2)).start();
    }

    public final void c(int i10) {
        this.b.a = new bi0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.b.b = new bi0(R.raw.speaker_to_bt, i10, i10, true, null);
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
                    this.b.c = new bi0(R.raw.camera_flip2, L, L, true, null);
                    q2 q2Var = this.b;
                    q2Var.c.R(q2Var);
                }
            } else if (c10 != 2) {
                if (c10 == 3) {
                    int i12 = this.c;
                    if (i12 == 5) {
                        q2 q2Var2 = this.b;
                        z12 = z10 == q2Var2.w;
                        bi0 bi0Var = z10 ? q2Var2.b : q2Var2.a;
                        bi0Var.R(q2Var2);
                        bi0Var.t0 = new m2(this, L, 1);
                        bi0Var.start();
                    } else if (i12 == 2) {
                        b(R.raw.bt_to_speaker, L, i10, z10);
                        z12 = true;
                    } else if (i12 != 4) {
                        a(L);
                    }
                } else if (c10 == 4) {
                    int i13 = this.c;
                    if (i13 == 4) {
                        q2 q2Var3 = this.b;
                        z12 = z10 == q2Var3.w;
                        bi0 bi0Var2 = z10 ? q2Var3.b : q2Var3.a;
                        bi0Var2.R(q2Var3);
                        bi0Var2.t0 = new m2(this, L, 0);
                        bi0Var2.start();
                    } else if (i13 == 2) {
                        b(R.raw.speaker_to_bt, L, i10, z10);
                        z12 = true;
                    } else if (i13 != 5) {
                        c(L);
                    }
                }
            } else if (this.c != 3) {
                this.b.a = new bi0(R.raw.video_stop, L, L, true, null);
                this.b.b = new bi0(R.raw.video_stop, L, L, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                q2 q2Var4 = this.b;
                q2Var4.b.R(q2Var4);
            }
            if (!z12) {
                this.b.a(i10, z10, (this.c == 0 || z11) ? false : true);
            }
            int c11 = m1.j.c(i10);
            L0 = c11 == 0 ? c11 != 1 ? c11 != 2 ? c11 != 3 ? c11 != 4 ? "" : cd.L0(2131743265, null) : cd.L0(2131743529, null) : z10 ? cd.L0(2131743264, null) : cd.L0(2131743263, null) : cd.L0(2131743432, null) : z10 ? cd.L0(2131743256, null) : cd.L0(2131743319, null);
            setContentDescription(L0);
            textView = this.d;
            visibility = textView.getVisibility();
            textView2 = this.e;
            if (visibility != 8 && textView2.getVisibility() == 8) {
                textView.setVisibility(0);
                textView.setText(L0);
                textView2.setText(L0);
            } else if (textView2.getText().equals(L0) || !textView.getText().equals(L0)) {
                textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(4.0f)).setDuration(140L).setListener(new iw0(1, (Object) this, (Object) L0)).start();
                textView2.setText(L0);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(org.telegram.messenger.i0.L(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new h2(this, 1)).start();
            }
            this.c = i10;
        }
        if (this.c != 1) {
            this.b.a = new bi0(R.raw.call_mute, L, L, true, null);
            this.b.b = new bi0(R.raw.call_mute, L, L, true, null);
            this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            q2 q2Var5 = this.b;
            q2Var5.b.R(q2Var5);
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
        textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(4.0f)).setDuration(140L).setListener(new iw0(1, (Object) this, (Object) L0)).start();
        textView2.setText(L0);
        textView2.setVisibility(0);
        textView2.setAlpha(0.0f);
        textView2.setTranslationY(org.telegram.messenger.i0.L(5.0f));
        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new h2(this, 1)).start();
        this.c = i10;
    }

    public void setOnBtnClickedListener(p2 p2Var) {
        this.b.setOnBtnClickedListener(p2Var);
    }
}
