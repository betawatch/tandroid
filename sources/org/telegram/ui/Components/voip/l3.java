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
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.ij0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        this.b.a = new ij0(R.raw.bt_to_speaker, "" + R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b = new ij0(R.raw.bt_to_speaker, "" + R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z4) {
        k3 k3Var = new k3(getContext(), this.a);
        if (i10 == R.raw.camera_flip2) {
            ij0 ij0Var = new ij0(i10, l.d.j(i10, ""), i11, i11, true, null);
            k3Var.c = ij0Var;
            ij0Var.s0 = k3Var;
        } else {
            k3Var.a = new ij0(i10, l.d.j(i10, ""), i11, i11, true, null);
            ij0 ij0Var2 = new ij0(i10, l.d.j(i10, ""), i11, i11, true, null);
            k3Var.b = ij0Var2;
            ij0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        k3Var.a(i12, z4, false);
        k3Var.setAlpha(0.0f);
        k3Var.setOnBtnClickedListener(this.b.x);
        addView(k3Var, c6.a(53.5f, 53.5f, 1));
        k3 k3Var2 = this.b;
        this.b = k3Var;
        k3Var.animate().alpha(1.0f).setDuration(250L).start();
        k3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new fx0(2, this, k3Var2)).start();
    }

    public final void c(int i10) {
        this.b.a = new ij0(R.raw.speaker_to_bt, "" + R.raw.speaker_to_bt, i10, i10, true, null);
        this.b.b = new ij0(R.raw.speaker_to_bt, "" + R.raw.speaker_to_bt, i10, i10, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, boolean z4, boolean z10) {
        String str;
        int i11;
        String string;
        TextView textView;
        int visibility;
        TextView textView2;
        boolean z11;
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
        boolean z12 = true;
        if (c3 == 0) {
            str = "";
            i11 = 1;
            if (this.c != 1) {
                this.b.a = new ij0(R.raw.call_mute, str + R.raw.call_mute, dp, dp, true, null);
                this.b.b = new ij0(R.raw.call_mute, str + R.raw.call_mute, dp, dp, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                k3 k3Var = this.b;
                k3Var.b.s0 = k3Var;
            }
        } else if (c3 != 1) {
            if (c3 != 2) {
                if (c3 == 3) {
                    int i12 = this.c;
                    if (i12 == 5) {
                        k3 k3Var2 = this.b;
                        z11 = z4 == k3Var2.v;
                        ij0 ij0Var = z4 ? k3Var2.b : k3Var2.a;
                        ij0Var.s0 = k3Var2;
                        ij0Var.r0 = new g3(this, dp, 1);
                        ij0Var.start();
                        str = "";
                        z12 = z11;
                        i11 = 1;
                    } else if (i12 == 2) {
                        b(R.raw.bt_to_speaker, dp, i10, z4);
                        str = "";
                        i11 = 1;
                    } else if (i12 != 4) {
                        a(dp);
                    }
                } else if (c3 == 4) {
                    int i13 = this.c;
                    if (i13 == 4) {
                        k3 k3Var3 = this.b;
                        z11 = z4 == k3Var3.v;
                        ij0 ij0Var2 = z4 ? k3Var3.b : k3Var3.a;
                        ij0Var2.s0 = k3Var3;
                        ij0Var2.r0 = new g3(this, dp, 0);
                        ij0Var2.start();
                        str = "";
                        z12 = z11;
                        i11 = 1;
                    } else if (i13 == 2) {
                        b(R.raw.speaker_to_bt, dp, i10, z4);
                        str = "";
                        i11 = 1;
                    } else if (i13 != 5) {
                        c(dp);
                    }
                }
                if (!z12) {
                    this.b.a(i10, z4, (this.c == 0 || z10) ? false : true);
                }
                int c10 = m1.j.c(i10);
                string = c10 != 0 ? c10 != i11 ? c10 != 2 ? c10 != 3 ? c10 != 4 ? str : LocaleController.getString(R.string.VoipSpeaker) : LocaleController.getString(R.string.VoipAudioRoutingBluetooth) : z4 ? LocaleController.getString(R.string.VoipStartVideo) : LocaleController.getString(R.string.VoipStopVideo) : LocaleController.getString(R.string.VoipFlip) : z4 ? LocaleController.getString(R.string.VoipUnmute) : LocaleController.getString(R.string.VoipMute);
                setContentDescription(string);
                textView = this.d;
                visibility = textView.getVisibility();
                textView2 = this.e;
                if (visibility != 8 && textView2.getVisibility() == 8) {
                    textView.setVisibility(0);
                    textView.setText(string);
                    textView2.setText(string);
                } else if (textView2.getText().equals(string) || !textView.getText().equals(string)) {
                    textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new fx0(1, this, string)).start();
                    textView2.setText(string);
                    textView2.setVisibility(0);
                    textView2.setAlpha(0.0f);
                    textView2.setTranslationY(AndroidUtilities.dp(5.0f));
                    textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new g91(this, 11)).start();
                }
                this.c = i10;
            }
            if (this.c != 3) {
                str = "";
                i11 = 1;
                this.b.a = new ij0(R.raw.video_stop, "" + R.raw.video_stop, dp, dp, true, null);
                this.b.b = new ij0(R.raw.video_stop, str + R.raw.video_stop, dp, dp, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                k3 k3Var4 = this.b;
                k3Var4.b.s0 = k3Var4;
            }
            str = "";
            i11 = 1;
        } else {
            str = "";
            i11 = 1;
            int i14 = this.c;
            if (i14 == 5 || i14 == 4) {
                b(R.raw.camera_flip2, dp, i10, z4);
                z12 = true;
                if (!z12) {
                }
                int c102 = m1.j.c(i10);
                if (c102 != 0) {
                }
                setContentDescription(string);
                textView = this.d;
                visibility = textView.getVisibility();
                textView2 = this.e;
                if (visibility != 8) {
                }
                if (textView2.getText().equals(string)) {
                }
                textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new fx0(1, this, string)).start();
                textView2.setText(string);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(AndroidUtilities.dp(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new g91(this, 11)).start();
                this.c = i10;
            }
            if (i14 != 2) {
                this.b.c = new ij0(R.raw.camera_flip2, str + R.raw.camera_flip2, dp, dp, true, null);
                k3 k3Var5 = this.b;
                k3Var5.c.s0 = k3Var5;
            }
        }
        z12 = false;
        if (!z12) {
        }
        int c1022 = m1.j.c(i10);
        if (c1022 != 0) {
        }
        setContentDescription(string);
        textView = this.d;
        visibility = textView.getVisibility();
        textView2 = this.e;
        if (visibility != 8) {
        }
        if (textView2.getText().equals(string)) {
        }
        textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new fx0(1, this, string)).start();
        textView2.setText(string);
        textView2.setVisibility(0);
        textView2.setAlpha(0.0f);
        textView2.setTranslationY(AndroidUtilities.dp(5.0f));
        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new g91(this, 11)).start();
        this.c = i10;
    }

    public void setOnBtnClickedListener(j3 j3Var) {
        this.b.setOnBtnClickedListener(j3Var);
    }
}
