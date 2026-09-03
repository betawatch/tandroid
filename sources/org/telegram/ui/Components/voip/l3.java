package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.hj0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l3 extends FrameLayout {
    public final o1 a;
    public k3 b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public l3(Activity activity, o1 o1Var) {
        super(activity);
        this.a = o1Var;
        setWillNotDraw(true);
        k3 k3Var = new k3(activity, o1Var);
        this.b = k3Var;
        addView(k3Var, c6.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, c6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, c6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        this.b.a = new hj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b = new hj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z4) {
        k3 k3Var = new k3(getContext(), this.a);
        if (i10 == R.raw.camera_flip2) {
            hj0 hj0Var = new hj0(i10, i11, i11, true, null);
            k3Var.c = hj0Var;
            hj0Var.s0 = k3Var;
        } else {
            k3Var.a = new hj0(i10, i11, i11, true, null);
            hj0 hj0Var2 = new hj0(i10, i11, i11, true, null);
            k3Var.b = hj0Var2;
            hj0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        k3Var.a(i12, z4, false);
        k3Var.setAlpha(0.0f);
        k3Var.setOnBtnClickedListener(this.b.x);
        addView(k3Var, c6.a(53.5f, 53.5f, 1));
        k3 k3Var2 = this.b;
        this.b = k3Var;
        k3Var.animate().alpha(1.0f).setDuration(250L).start();
        k3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new ex0(2, this, k3Var2)).start();
    }

    public final void c(int i10) {
        this.b.a = new hj0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.b.b = new hj0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, boolean z4, boolean z10) {
        boolean z11;
        String string;
        TextView textView;
        int visibility;
        TextView textView2;
        if (this.c == i10 && z4 == this.b.v) {
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
        int c3 = m1.j.c(i10);
        if (c3 != 0) {
            if (c3 == 1) {
                int i11 = this.c;
                if (i11 == 5 || i11 == 4) {
                    b(R.raw.camera_flip2, dp, i10, z4);
                    z11 = true;
                } else if (i11 != 2) {
                    this.b.c = new hj0(R.raw.camera_flip2, dp, dp, true, null);
                    k3 k3Var = this.b;
                    k3Var.c.s0 = k3Var;
                }
            } else if (c3 != 2) {
                if (c3 == 3) {
                    int i12 = this.c;
                    if (i12 == 5) {
                        k3 k3Var2 = this.b;
                        z11 = z4 == k3Var2.v;
                        hj0 hj0Var = z4 ? k3Var2.b : k3Var2.a;
                        hj0Var.s0 = k3Var2;
                        hj0Var.r0 = new g3(this, dp, 1);
                        hj0Var.start();
                    } else if (i12 == 2) {
                        b(R.raw.bt_to_speaker, dp, i10, z4);
                        z11 = true;
                    } else if (i12 != 4) {
                        a(dp);
                    }
                } else if (c3 == 4) {
                    int i13 = this.c;
                    if (i13 == 4) {
                        k3 k3Var3 = this.b;
                        z11 = z4 == k3Var3.v;
                        hj0 hj0Var2 = z4 ? k3Var3.b : k3Var3.a;
                        hj0Var2.s0 = k3Var3;
                        hj0Var2.r0 = new g3(this, dp, 0);
                        hj0Var2.start();
                    } else if (i13 == 2) {
                        b(R.raw.speaker_to_bt, dp, i10, z4);
                        z11 = true;
                    } else if (i13 != 5) {
                        c(dp);
                    }
                }
            } else if (this.c != 3) {
                this.b.a = new hj0(R.raw.video_stop, dp, dp, true, null);
                this.b.b = new hj0(R.raw.video_stop, dp, dp, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                k3 k3Var4 = this.b;
                k3Var4.b.s0 = k3Var4;
            }
            if (!z11) {
                this.b.a(i10, z4, (this.c == 0 || z10) ? false : true);
            }
            int c10 = m1.j.c(i10);
            string = c10 == 0 ? c10 != 1 ? c10 != 2 ? c10 != 3 ? c10 != 4 ? "" : LocaleController.getString(R.string.VoipSpeaker) : LocaleController.getString(R.string.VoipAudioRoutingBluetooth) : z4 ? LocaleController.getString(R.string.VoipStartVideo) : LocaleController.getString(R.string.VoipStopVideo) : LocaleController.getString(R.string.VoipFlip) : z4 ? LocaleController.getString(R.string.VoipUnmute) : LocaleController.getString(R.string.VoipMute);
            setContentDescription(string);
            textView = this.d;
            visibility = textView.getVisibility();
            textView2 = this.e;
            if (visibility != 8 && textView2.getVisibility() == 8) {
                textView.setVisibility(0);
                textView.setText(string);
                textView2.setText(string);
            } else if (textView2.getText().equals(string) || !textView.getText().equals(string)) {
                textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new ex0(1, this, string)).start();
                textView2.setText(string);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(AndroidUtilities.dp(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new f91(this, 11)).start();
            }
            this.c = i10;
        }
        if (this.c != 1) {
            this.b.a = new hj0(R.raw.call_mute, dp, dp, true, null);
            this.b.b = new hj0(R.raw.call_mute, dp, dp, true, null);
            this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            k3 k3Var5 = this.b;
            k3Var5.b.s0 = k3Var5;
        }
        z11 = false;
        if (!z11) {
        }
        int c102 = m1.j.c(i10);
        if (c102 == 0) {
        }
        setContentDescription(string);
        textView = this.d;
        visibility = textView.getVisibility();
        textView2 = this.e;
        if (visibility != 8) {
        }
        if (textView2.getText().equals(string)) {
        }
        textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new ex0(1, this, string)).start();
        textView2.setText(string);
        textView2.setVisibility(0);
        textView2.setAlpha(0.0f);
        textView2.setTranslationY(AndroidUtilities.dp(5.0f));
        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new f91(this, 11)).start();
        this.c = i10;
    }

    public void setOnBtnClickedListener(j3 j3Var) {
        this.b.setOnBtnClickedListener(j3Var);
    }
}
