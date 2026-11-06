package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.v50;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.va;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class b3 extends FrameLayout {
    public final i1 a;
    public a3 b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public b3(Activity activity, i1 i1Var) {
        super(activity);
        this.a = i1Var;
        setWillNotDraw(true);
        a3 a3Var = new a3(activity, i1Var);
        this.b = a3Var;
        addView(a3Var, ha.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, ha.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, ha.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i7) {
        this.b.a = new zg0(R.raw.bt_to_speaker, i7, i7, true, null);
        this.b.b = new zg0(R.raw.bt_to_speaker, i7, i7, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i7, int i10, int i11, boolean z9) {
        a3 a3Var = new a3(getContext(), this.a);
        if (i7 == R.raw.camera_flip2) {
            zg0 zg0Var = new zg0(i7, i10, i10, true, null);
            a3Var.c = zg0Var;
            zg0Var.R(a3Var);
        } else {
            a3Var.a = new zg0(i7, i10, i10, true, null);
            zg0 zg0Var2 = new zg0(i7, i10, i10, true, null);
            a3Var.b = zg0Var2;
            zg0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        a3Var.a(i11, z9, false);
        a3Var.setAlpha(0.0f);
        a3Var.setOnBtnClickedListener(this.b.y);
        addView(a3Var, ha.a(53.5f, 53.5f, 1));
        a3 a3Var2 = this.b;
        this.b = a3Var;
        a3Var.animate().alpha(1.0f).setDuration(250L).start();
        a3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new v50(7, this, a3Var2)).start();
    }

    public final void c(int i7) {
        this.b.a = new zg0(R.raw.speaker_to_bt, i7, i7, true, null);
        this.b.b = new zg0(R.raw.speaker_to_bt, i7, i7, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i7, boolean z9, boolean z10) {
        boolean z11;
        String M0;
        TextView textView;
        int visibility;
        TextView textView2;
        if (this.c == i7 && z9 == this.b.w) {
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
                    b(R.raw.camera_flip2, L, i7, z9);
                    z11 = true;
                } else if (i10 != 2) {
                    this.b.c = new zg0(R.raw.camera_flip2, L, L, true, null);
                    a3 a3Var = this.b;
                    a3Var.c.R(a3Var);
                }
            } else if (c10 != 2) {
                if (c10 == 3) {
                    int i11 = this.c;
                    if (i11 == 5) {
                        a3 a3Var2 = this.b;
                        z11 = z9 == a3Var2.w;
                        zg0 zg0Var = z9 ? a3Var2.b : a3Var2.a;
                        zg0Var.R(a3Var2);
                        zg0Var.t0 = new w2(this, L, 1);
                        zg0Var.start();
                    } else if (i11 == 2) {
                        b(R.raw.bt_to_speaker, L, i7, z9);
                        z11 = true;
                    } else if (i11 != 4) {
                        a(L);
                    }
                } else if (c10 == 4) {
                    int i12 = this.c;
                    if (i12 == 4) {
                        a3 a3Var3 = this.b;
                        z11 = z9 == a3Var3.w;
                        zg0 zg0Var2 = z9 ? a3Var3.b : a3Var3.a;
                        zg0Var2.R(a3Var3);
                        zg0Var2.t0 = new w2(this, L, 0);
                        zg0Var2.start();
                    } else if (i12 == 2) {
                        b(R.raw.speaker_to_bt, L, i7, z9);
                        z11 = true;
                    } else if (i12 != 5) {
                        c(L);
                    }
                }
            } else if (this.c != 3) {
                this.b.a = new zg0(R.raw.video_stop, L, L, true, null);
                this.b.b = new zg0(R.raw.video_stop, L, L, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                a3 a3Var4 = this.b;
                a3Var4.b.R(a3Var4);
            }
            if (!z11) {
                this.b.a(i7, z9, (this.c == 0 || z10) ? false : true);
            }
            int c11 = p1.g.c(i7);
            M0 = c11 == 0 ? c11 != 1 ? c11 != 2 ? c11 != 3 ? c11 != 4 ? "" : hd.M0(2131743240, null) : hd.M0(2131743504, null) : z9 ? hd.M0(2131743239, null) : hd.M0(2131743238, null) : hd.M0(2131743407, null) : z9 ? hd.M0(2131743231, null) : hd.M0(2131743294, null);
            setContentDescription(M0);
            textView = this.d;
            visibility = textView.getVisibility();
            textView2 = this.e;
            if (visibility != 8 && textView2.getVisibility() == 8) {
                textView.setVisibility(0);
                textView.setText(M0);
                textView2.setText(M0);
            } else if (textView2.getText().equals(M0) || !textView.getText().equals(M0)) {
                textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(4.0f)).setDuration(140L).setListener(new v50(6, this, M0)).start();
                textView2.setText(M0);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(org.telegram.messenger.g0.L(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new va(this, 20)).start();
            }
            this.c = i7;
        }
        if (this.c != 1) {
            this.b.a = new zg0(R.raw.call_mute, L, L, true, null);
            this.b.b = new zg0(R.raw.call_mute, L, L, true, null);
            this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            a3 a3Var5 = this.b;
            a3Var5.b.R(a3Var5);
        }
        z11 = false;
        if (!z11) {
        }
        int c112 = p1.g.c(i7);
        if (c112 == 0) {
        }
        setContentDescription(M0);
        textView = this.d;
        visibility = textView.getVisibility();
        textView2 = this.e;
        if (visibility != 8) {
        }
        if (textView2.getText().equals(M0)) {
        }
        textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(4.0f)).setDuration(140L).setListener(new v50(6, this, M0)).start();
        textView2.setText(M0);
        textView2.setVisibility(0);
        textView2.setAlpha(0.0f);
        textView2.setTranslationY(org.telegram.messenger.g0.L(5.0f));
        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new va(this, 20)).start();
        this.c = i7;
    }

    public void setOnBtnClickedListener(z2 z2Var) {
        this.b.setOnBtnClickedListener(z2Var);
    }
}
