package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.h60;
import org.telegram.ui.Components.mh0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e3 extends FrameLayout {
    public final l1 a;
    public d3 b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public e3(Activity activity, l1 l1Var) {
        super(activity);
        this.a = l1Var;
        setWillNotDraw(true);
        d3 d3Var = new d3(activity, l1Var);
        this.b = d3Var;
        addView(d3Var, ma.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, ma.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, ma.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i7) {
        this.b.a = new mh0(R.raw.bt_to_speaker, i7, i7, true, null);
        this.b.b = new mh0(R.raw.bt_to_speaker, i7, i7, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i7, int i10, int i11, boolean z10) {
        d3 d3Var = new d3(getContext(), this.a);
        if (i7 == R.raw.camera_flip2) {
            mh0 mh0Var = new mh0(i7, i10, i10, true, null);
            d3Var.c = mh0Var;
            mh0Var.R(d3Var);
        } else {
            d3Var.a = new mh0(i7, i10, i10, true, null);
            mh0 mh0Var2 = new mh0(i7, i10, i10, true, null);
            d3Var.b = mh0Var2;
            mh0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        d3Var.a(i11, z10, false);
        d3Var.setAlpha(0.0f);
        d3Var.setOnBtnClickedListener(this.b.y);
        addView(d3Var, ma.a(53.5f, 53.5f, 1));
        d3 d3Var2 = this.b;
        this.b = d3Var;
        d3Var.animate().alpha(1.0f).setDuration(250L).start();
        d3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new h60(7, this, d3Var2)).start();
    }

    public final void c(int i7) {
        this.b.a = new mh0(R.raw.speaker_to_bt, i7, i7, true, null);
        this.b.b = new mh0(R.raw.speaker_to_bt, i7, i7, true, null);
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
        String M0;
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
                    this.b.c = new mh0(R.raw.camera_flip2, L, L, true, null);
                    d3 d3Var = this.b;
                    d3Var.c.R(d3Var);
                }
            } else if (c10 != 2) {
                if (c10 == 3) {
                    int i11 = this.c;
                    if (i11 == 5) {
                        d3 d3Var2 = this.b;
                        z12 = z10 == d3Var2.w;
                        mh0 mh0Var = z10 ? d3Var2.b : d3Var2.a;
                        mh0Var.R(d3Var2);
                        mh0Var.u0 = new z2(this, L, 1);
                        mh0Var.start();
                    } else if (i11 == 2) {
                        b(R.raw.bt_to_speaker, L, i7, z10);
                        z12 = true;
                    } else if (i11 != 4) {
                        a(L);
                    }
                } else if (c10 == 4) {
                    int i12 = this.c;
                    if (i12 == 4) {
                        d3 d3Var3 = this.b;
                        z12 = z10 == d3Var3.w;
                        mh0 mh0Var2 = z10 ? d3Var3.b : d3Var3.a;
                        mh0Var2.R(d3Var3);
                        mh0Var2.u0 = new z2(this, L, 0);
                        mh0Var2.start();
                    } else if (i12 == 2) {
                        b(R.raw.speaker_to_bt, L, i7, z10);
                        z12 = true;
                    } else if (i12 != 5) {
                        c(L);
                    }
                }
            } else if (this.c != 3) {
                this.b.a = new mh0(R.raw.video_stop, L, L, true, null);
                this.b.b = new mh0(R.raw.video_stop, L, L, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                d3 d3Var4 = this.b;
                d3Var4.b.R(d3Var4);
            }
            if (!z12) {
                this.b.a(i7, z10, (this.c == 0 || z11) ? false : true);
            }
            int c11 = p1.g.c(i7);
            M0 = c11 == 0 ? c11 != 1 ? c11 != 2 ? c11 != 3 ? c11 != 4 ? "" : gd.M0(2131743002, null) : gd.M0(2131743266, null) : z10 ? gd.M0(2131743001, null) : gd.M0(2131743000, null) : gd.M0(2131743169, null) : z10 ? gd.M0(2131742993, null) : gd.M0(2131743056, null);
            setContentDescription(M0);
            textView = this.d;
            visibility = textView.getVisibility();
            textView2 = this.e;
            if (visibility != 8 && textView2.getVisibility() == 8) {
                textView.setVisibility(0);
                textView.setText(M0);
                textView2.setText(M0);
            } else if (textView2.getText().equals(M0) || !textView.getText().equals(M0)) {
                textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(4.0f)).setDuration(140L).setListener(new h60(6, this, M0)).start();
                textView2.setText(M0);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(org.telegram.messenger.g0.L(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new y9(this, 21)).start();
            }
            this.c = i7;
        }
        if (this.c != 1) {
            this.b.a = new mh0(R.raw.call_mute, L, L, true, null);
            this.b.b = new mh0(R.raw.call_mute, L, L, true, null);
            this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            d3 d3Var5 = this.b;
            d3Var5.b.R(d3Var5);
        }
        z12 = false;
        if (!z12) {
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
        textView.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(4.0f)).setDuration(140L).setListener(new h60(6, this, M0)).start();
        textView2.setText(M0);
        textView2.setVisibility(0);
        textView2.setAlpha(0.0f);
        textView2.setTranslationY(org.telegram.messenger.g0.L(5.0f));
        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new y9(this, 21)).start();
        this.c = i7;
    }

    public void setOnBtnClickedListener(c3 c3Var) {
        this.b.setOnBtnClickedListener(c3Var);
    }
}
