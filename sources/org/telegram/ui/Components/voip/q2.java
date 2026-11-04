package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.ri0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q2 extends FrameLayout {
    public final x0 a;
    public p2 b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public q2(Activity activity, x0 x0Var) {
        super(activity);
        this.a = x0Var;
        setWillNotDraw(true);
        p2 p2Var = new p2(activity, x0Var);
        this.b = p2Var;
        addView(p2Var, mf.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, mf.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, mf.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i3) {
        this.b.a = new ch0(R.raw.bt_to_speaker, i3, i3, true, null);
        this.b.b = new ch0(R.raw.bt_to_speaker, i3, i3, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i3, int i10, int i11, boolean z10) {
        p2 p2Var = new p2(getContext(), this.a);
        if (i3 == R.raw.camera_flip2) {
            ch0 ch0Var = new ch0(i3, i10, i10, true, null);
            p2Var.c = ch0Var;
            ch0Var.R(p2Var);
        } else {
            p2Var.a = new ch0(i3, i10, i10, true, null);
            ch0 ch0Var2 = new ch0(i3, i10, i10, true, null);
            p2Var.b = ch0Var2;
            ch0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        p2Var.a(i11, z10, false);
        p2Var.setAlpha(0.0f);
        p2Var.setOnBtnClickedListener(this.b.y);
        addView(p2Var, mf.a(53.5f, 53.5f, 1));
        p2 p2Var2 = this.b;
        this.b = p2Var;
        p2Var.animate().alpha(1.0f).setDuration(250L).start();
        p2Var2.animate().alpha(0.0f).setDuration(250L).setListener(new ri0(6, this, p2Var2)).start();
    }

    public final void c(int i3) {
        this.b.a = new ch0(R.raw.speaker_to_bt, i3, i3, true, null);
        this.b.b = new ch0(R.raw.speaker_to_bt, i3, i3, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i3, boolean z10, boolean z11) {
        int i10;
        String M0;
        TextView textView;
        int visibility;
        TextView textView2;
        boolean z12;
        if (this.c == i3 && z10 == this.b.w) {
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
        int c2 = o1.g.c(i3);
        int i11 = 5;
        boolean z13 = true;
        if (c2 == 0) {
            i10 = 1;
            if (this.c != 1) {
                this.b.a = new ch0(R.raw.call_mute, L, L, true, null);
                this.b.b = new ch0(R.raw.call_mute, L, L, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                p2 p2Var = this.b;
                p2Var.b.R(p2Var);
            }
        } else if (c2 != 1) {
            if (c2 != 2) {
                if (c2 == 3) {
                    int i12 = this.c;
                    if (i12 == 5) {
                        p2 p2Var2 = this.b;
                        z12 = z10 == p2Var2.w;
                        ch0 ch0Var = z10 ? p2Var2.b : p2Var2.a;
                        ch0Var.R(p2Var2);
                        ch0Var.u0 = new l2(this, L, 1);
                        ch0Var.start();
                        i10 = 1;
                        z13 = z12;
                        if (!z13) {
                        }
                        int c10 = o1.g.c(i3);
                        if (c10 == 0) {
                        }
                        setContentDescription(M0);
                        textView = this.d;
                        visibility = textView.getVisibility();
                        textView2 = this.e;
                        if (visibility != 8) {
                        }
                        if (textView2.getText().equals(M0)) {
                        }
                        textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(4.0f)).setDuration(140L).setListener(new ri0(i11, this, M0)).start();
                        textView2.setText(M0);
                        textView2.setVisibility(0);
                        textView2.setAlpha(0.0f);
                        textView2.setTranslationY(org.telegram.messenger.g0.L(5.0f));
                        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new w9(this, 20)).start();
                        this.c = i3;
                    }
                    if (i12 == 2) {
                        b(R.raw.bt_to_speaker, L, i3, z10);
                        i10 = 1;
                        if (!z13) {
                        }
                        int c102 = o1.g.c(i3);
                        if (c102 == 0) {
                        }
                        setContentDescription(M0);
                        textView = this.d;
                        visibility = textView.getVisibility();
                        textView2 = this.e;
                        if (visibility != 8) {
                        }
                        if (textView2.getText().equals(M0)) {
                        }
                        textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(4.0f)).setDuration(140L).setListener(new ri0(i11, this, M0)).start();
                        textView2.setText(M0);
                        textView2.setVisibility(0);
                        textView2.setAlpha(0.0f);
                        textView2.setTranslationY(org.telegram.messenger.g0.L(5.0f));
                        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new w9(this, 20)).start();
                        this.c = i3;
                    }
                    if (i12 != 4) {
                        a(L);
                    }
                } else if (c2 == 4) {
                    int i13 = this.c;
                    if (i13 == 4) {
                        p2 p2Var3 = this.b;
                        z12 = z10 == p2Var3.w;
                        ch0 ch0Var2 = z10 ? p2Var3.b : p2Var3.a;
                        ch0Var2.R(p2Var3);
                        ch0Var2.u0 = new l2(this, L, 0);
                        ch0Var2.start();
                        i10 = 1;
                        z13 = z12;
                        if (!z13) {
                            this.b.a(i3, z10, (this.c == 0 || z11) ? 0 : i10);
                        }
                        int c1022 = o1.g.c(i3);
                        M0 = c1022 == 0 ? c1022 != i10 ? c1022 != 2 ? c1022 != 3 ? c1022 != 4 ? "" : bd.M0(2131743249, null) : bd.M0(2131743513, null) : z10 ? bd.M0(2131743248, null) : bd.M0(2131743247, null) : bd.M0(2131743416, null) : z10 ? bd.M0(2131743240, null) : bd.M0(2131743303, null);
                        setContentDescription(M0);
                        textView = this.d;
                        visibility = textView.getVisibility();
                        textView2 = this.e;
                        if (visibility != 8 && textView2.getVisibility() == 8) {
                            textView.setVisibility(0);
                            textView.setText(M0);
                            textView2.setText(M0);
                        } else if (textView2.getText().equals(M0) || !textView.getText().equals(M0)) {
                            textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(4.0f)).setDuration(140L).setListener(new ri0(i11, this, M0)).start();
                            textView2.setText(M0);
                            textView2.setVisibility(0);
                            textView2.setAlpha(0.0f);
                            textView2.setTranslationY(org.telegram.messenger.g0.L(5.0f));
                            textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new w9(this, 20)).start();
                        }
                        this.c = i3;
                    }
                    if (i13 == 2) {
                        b(R.raw.speaker_to_bt, L, i3, z10);
                        i10 = 1;
                        if (!z13) {
                        }
                        int c10222 = o1.g.c(i3);
                        if (c10222 == 0) {
                        }
                        setContentDescription(M0);
                        textView = this.d;
                        visibility = textView.getVisibility();
                        textView2 = this.e;
                        if (visibility != 8) {
                        }
                        if (textView2.getText().equals(M0)) {
                        }
                        textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(4.0f)).setDuration(140L).setListener(new ri0(i11, this, M0)).start();
                        textView2.setText(M0);
                        textView2.setVisibility(0);
                        textView2.setAlpha(0.0f);
                        textView2.setTranslationY(org.telegram.messenger.g0.L(5.0f));
                        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new w9(this, 20)).start();
                        this.c = i3;
                    }
                    if (i13 != 5) {
                        c(L);
                    }
                }
            } else if (this.c != 3) {
                i10 = 1;
                this.b.a = new ch0(R.raw.video_stop, L, L, true, null);
                this.b.b = new ch0(R.raw.video_stop, L, L, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                p2 p2Var4 = this.b;
                p2Var4.b.R(p2Var4);
            }
            i10 = 1;
        } else {
            i10 = 1;
            int i14 = this.c;
            if (i14 == 5 || i14 == 4) {
                b(R.raw.camera_flip2, L, i3, z10);
                z13 = true;
                if (!z13) {
                }
                int c102222 = o1.g.c(i3);
                if (c102222 == 0) {
                }
                setContentDescription(M0);
                textView = this.d;
                visibility = textView.getVisibility();
                textView2 = this.e;
                if (visibility != 8) {
                }
                if (textView2.getText().equals(M0)) {
                }
                textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(4.0f)).setDuration(140L).setListener(new ri0(i11, this, M0)).start();
                textView2.setText(M0);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(org.telegram.messenger.g0.L(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new w9(this, 20)).start();
                this.c = i3;
            }
            if (i14 != 2) {
                this.b.c = new ch0(R.raw.camera_flip2, L, L, true, null);
                p2 p2Var5 = this.b;
                p2Var5.c.R(p2Var5);
            }
        }
        z13 = false;
        if (!z13) {
        }
        int c1022222 = o1.g.c(i3);
        if (c1022222 == 0) {
        }
        setContentDescription(M0);
        textView = this.d;
        visibility = textView.getVisibility();
        textView2 = this.e;
        if (visibility != 8) {
        }
        if (textView2.getText().equals(M0)) {
        }
        textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(4.0f)).setDuration(140L).setListener(new ri0(i11, this, M0)).start();
        textView2.setText(M0);
        textView2.setVisibility(0);
        textView2.setAlpha(0.0f);
        textView2.setTranslationY(org.telegram.messenger.g0.L(5.0f));
        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new w9(this, 20)).start();
        this.c = i3;
    }

    public void setOnBtnClickedListener(o2 o2Var) {
        this.b.setOnBtnClickedListener(o2Var);
    }
}
