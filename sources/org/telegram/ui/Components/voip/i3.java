package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.xi0;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class i3 extends FrameLayout {
    public final o1 a;
    public h3 b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public i3(Activity activity, o1 o1Var) {
        super(activity);
        this.a = o1Var;
        setWillNotDraw(true);
        h3 h3Var = new h3(activity, o1Var);
        this.b = h3Var;
        addView(h3Var, x5.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, x5.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, x5.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        this.b.a = new xi0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b = new xi0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        h3 h3Var = new h3(getContext(), this.a);
        if (i10 == R.raw.camera_flip2) {
            xi0 xi0Var = new xi0(i10, i11, i11, true, null);
            h3Var.c = xi0Var;
            xi0Var.v0 = h3Var;
        } else {
            h3Var.a = new xi0(i10, i11, i11, true, null);
            xi0 xi0Var2 = new xi0(i10, i11, i11, true, null);
            h3Var.b = xi0Var2;
            xi0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        h3Var.a(i12, z10, false);
        h3Var.setAlpha(0.0f);
        h3Var.setOnBtnClickedListener(this.b.x);
        addView(h3Var, x5.a(53.5f, 53.5f, 1));
        h3 h3Var2 = this.b;
        this.b = h3Var;
        h3Var.animate().alpha(1.0f).setDuration(250L).start();
        h3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new pk0(5, this, h3Var2)).start();
    }

    public final void c(int i10) {
        this.b.a = new xi0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.b.b = new xi0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, boolean z10, boolean z11) {
        boolean z12;
        String string;
        TextView textView;
        int visibility;
        TextView textView2;
        if (this.c == i10 && z10 == this.b.v) {
            if (getVisibility() != 0) {
                setVisibility(0);
                return;
            }
            return;
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        int dp = AndroidUtilities.dp(53.5f);
        int c10 = m1.j.c(i10);
        if (c10 != 0) {
            if (c10 == 1) {
                int i11 = this.c;
                if (i11 == 5 || i11 == 4) {
                    b(R.raw.camera_flip2, dp, i10, z10);
                    z12 = true;
                } else if (i11 != 2) {
                    this.b.c = new xi0(R.raw.camera_flip2, dp, dp, true, null);
                    h3 h3Var = this.b;
                    h3Var.c.v0 = h3Var;
                }
            } else if (c10 != 2) {
                if (c10 == 3) {
                    int i12 = this.c;
                    if (i12 == 5) {
                        h3 h3Var2 = this.b;
                        z12 = z10 == h3Var2.v;
                        xi0 xi0Var = z10 ? h3Var2.b : h3Var2.a;
                        xi0Var.v0 = h3Var2;
                        xi0Var.u0 = new d3(this, dp, 1);
                        xi0Var.start();
                    } else if (i12 == 2) {
                        b(R.raw.bt_to_speaker, dp, i10, z10);
                        z12 = true;
                    } else if (i12 != 4) {
                        a(dp);
                    }
                } else if (c10 == 4) {
                    int i13 = this.c;
                    if (i13 == 4) {
                        h3 h3Var3 = this.b;
                        z12 = z10 == h3Var3.v;
                        xi0 xi0Var2 = z10 ? h3Var3.b : h3Var3.a;
                        xi0Var2.v0 = h3Var3;
                        xi0Var2.u0 = new d3(this, dp, 0);
                        xi0Var2.start();
                    } else if (i13 == 2) {
                        b(R.raw.speaker_to_bt, dp, i10, z10);
                        z12 = true;
                    } else if (i13 != 5) {
                        c(dp);
                    }
                }
            } else if (this.c != 3) {
                this.b.a = new xi0(R.raw.video_stop, dp, dp, true, null);
                this.b.b = new xi0(R.raw.video_stop, dp, dp, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                h3 h3Var4 = this.b;
                h3Var4.b.v0 = h3Var4;
            }
            if (!z12) {
                this.b.a(i10, z10, (this.c == 0 || z11) ? false : true);
            }
            int c11 = m1.j.c(i10);
            string = c11 == 0 ? c11 != 1 ? c11 != 2 ? c11 != 3 ? c11 != 4 ? "" : LocaleController.getString(R.string.VoipSpeaker) : LocaleController.getString(R.string.VoipAudioRoutingBluetooth) : z10 ? LocaleController.getString(R.string.VoipStartVideo) : LocaleController.getString(R.string.VoipStopVideo) : LocaleController.getString(R.string.VoipFlip) : z10 ? LocaleController.getString(R.string.VoipUnmute) : LocaleController.getString(R.string.VoipMute);
            setContentDescription(string);
            textView = this.d;
            visibility = textView.getVisibility();
            textView2 = this.e;
            if (visibility != 8 && textView2.getVisibility() == 8) {
                textView.setVisibility(0);
                textView.setText(string);
                textView2.setText(string);
            } else if (textView2.getText().equals(string) || !textView.getText().equals(string)) {
                textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new pk0(4, this, string)).start();
                textView2.setText(string);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(AndroidUtilities.dp(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new k61(this, 15)).start();
            }
            this.c = i10;
        }
        if (this.c != 1) {
            this.b.a = new xi0(R.raw.call_mute, dp, dp, true, null);
            this.b.b = new xi0(R.raw.call_mute, dp, dp, true, null);
            this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            h3 h3Var5 = this.b;
            h3Var5.b.v0 = h3Var5;
        }
        z12 = false;
        if (!z12) {
        }
        int c112 = m1.j.c(i10);
        if (c112 == 0) {
        }
        setContentDescription(string);
        textView = this.d;
        visibility = textView.getVisibility();
        textView2 = this.e;
        if (visibility != 8) {
        }
        if (textView2.getText().equals(string)) {
        }
        textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new pk0(4, this, string)).start();
        textView2.setText(string);
        textView2.setVisibility(0);
        textView2.setAlpha(0.0f);
        textView2.setTranslationY(AndroidUtilities.dp(5.0f));
        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new k61(this, 15)).start();
        this.c = i10;
    }

    public void setOnBtnClickedListener(g3 g3Var) {
        this.b.setOnBtnClickedListener(g3Var);
    }
}
