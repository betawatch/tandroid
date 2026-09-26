package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.q81;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class l3 extends FrameLayout {
    public final r1 a;
    public k3 b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public l3(Activity activity, r1 r1Var) {
        super(activity);
        this.a = r1Var;
        setWillNotDraw(true);
        k3 k3Var = new k3(activity, r1Var);
        this.b = k3Var;
        addView(k3Var, y5.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, y5.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, y5.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        this.b.a = new ij0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b = new ij0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        k3 k3Var = new k3(getContext(), this.a);
        if (i10 == R.raw.camera_flip2) {
            ij0 ij0Var = new ij0(i10, i11, i11, true, null);
            k3Var.c = ij0Var;
            ij0Var.R(k3Var);
        } else {
            k3Var.a = new ij0(i10, i11, i11, true, null);
            ij0 ij0Var2 = new ij0(i10, i11, i11, true, null);
            k3Var.b = ij0Var2;
            ij0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        k3Var.a(i12, z10, false);
        k3Var.setAlpha(0.0f);
        k3Var.setOnBtnClickedListener(this.b.x);
        addView(k3Var, y5.a(53.5f, 53.5f, 1));
        k3 k3Var2 = this.b;
        this.b = k3Var;
        k3Var.animate().alpha(1.0f).setDuration(250L).start();
        k3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new al0(5, this, k3Var2)).start();
    }

    public final void c(int i10) {
        this.b.a = new ij0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.b.b = new ij0(R.raw.speaker_to_bt, i10, i10, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017b  */
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
                    this.b.c = new ij0(R.raw.camera_flip2, dp, dp, true, null);
                    k3 k3Var = this.b;
                    k3Var.c.R(k3Var);
                }
            } else if (c10 != 2) {
                if (c10 == 3) {
                    int i12 = this.c;
                    if (i12 == 5) {
                        k3 k3Var2 = this.b;
                        z12 = z10 == k3Var2.v;
                        ij0 ij0Var = z10 ? k3Var2.b : k3Var2.a;
                        ij0Var.R(k3Var2);
                        ij0Var.t0 = new g3(this, dp, 1);
                        ij0Var.start();
                    } else if (i12 == 2) {
                        b(R.raw.bt_to_speaker, dp, i10, z10);
                        z12 = true;
                    } else if (i12 != 4) {
                        a(dp);
                    }
                } else if (c10 == 4) {
                    int i13 = this.c;
                    if (i13 == 4) {
                        k3 k3Var3 = this.b;
                        z12 = z10 == k3Var3.v;
                        ij0 ij0Var2 = z10 ? k3Var3.b : k3Var3.a;
                        ij0Var2.R(k3Var3);
                        ij0Var2.t0 = new g3(this, dp, 0);
                        ij0Var2.start();
                    } else if (i13 == 2) {
                        b(R.raw.speaker_to_bt, dp, i10, z10);
                        z12 = true;
                    } else if (i13 != 5) {
                        c(dp);
                    }
                }
            } else if (this.c != 3) {
                this.b.a = new ij0(R.raw.video_stop, dp, dp, true, null);
                this.b.b = new ij0(R.raw.video_stop, dp, dp, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                k3 k3Var4 = this.b;
                k3Var4.b.R(k3Var4);
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
                textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new al0(4, this, string)).start();
                textView2.setText(string);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(AndroidUtilities.dp(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new q81(this, 13)).start();
            }
            this.c = i10;
        }
        if (this.c != 1) {
            this.b.a = new ij0(R.raw.call_mute, dp, dp, true, null);
            this.b.b = new ij0(R.raw.call_mute, dp, dp, true, null);
            this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            k3 k3Var5 = this.b;
            k3Var5.b.R(k3Var5);
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
        textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new al0(4, this, string)).start();
        textView2.setText(string);
        textView2.setVisibility(0);
        textView2.setAlpha(0.0f);
        textView2.setTranslationY(AndroidUtilities.dp(5.0f));
        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new q81(this, 13)).start();
        this.c = i10;
    }

    public void setOnBtnClickedListener(j3 j3Var) {
        this.b.setOnBtnClickedListener(j3Var);
    }
}
