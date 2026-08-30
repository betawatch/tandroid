package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.gj0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class k3 extends FrameLayout {
    public final n1 a;
    public j3 b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public k3(Activity activity, n1 n1Var) {
        super(activity);
        this.a = n1Var;
        setWillNotDraw(true);
        j3 j3Var = new j3(activity, n1Var);
        this.b = j3Var;
        addView(j3Var, b6.a(53.5f, 53.5f, 1));
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
        this.b.a = new gj0(R.raw.bt_to_speaker, "" + R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b = new gj0(R.raw.bt_to_speaker, "" + R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z4) {
        j3 j3Var = new j3(getContext(), this.a);
        if (i10 == R.raw.camera_flip2) {
            gj0 gj0Var = new gj0(i10, kh.a2.j(i10, ""), i11, i11, true, null);
            j3Var.c = gj0Var;
            gj0Var.s0 = j3Var;
        } else {
            j3Var.a = new gj0(i10, kh.a2.j(i10, ""), i11, i11, true, null);
            gj0 gj0Var2 = new gj0(i10, kh.a2.j(i10, ""), i11, i11, true, null);
            j3Var.b = gj0Var2;
            gj0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        j3Var.a(i12, z4, false);
        j3Var.setAlpha(0.0f);
        j3Var.setOnBtnClickedListener(this.b.x);
        addView(j3Var, b6.a(53.5f, 53.5f, 1));
        j3 j3Var2 = this.b;
        this.b = j3Var;
        j3Var.animate().alpha(1.0f).setDuration(250L).start();
        j3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new ex0(2, this, j3Var2)).start();
    }

    public final void c(int i10) {
        this.b.a = new gj0(R.raw.speaker_to_bt, "" + R.raw.speaker_to_bt, i10, i10, true, null);
        this.b.b = new gj0(R.raw.speaker_to_bt, "" + R.raw.speaker_to_bt, i10, i10, true, null);
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
        int b10 = m1.j.b(i10);
        boolean z12 = true;
        if (b10 == 0) {
            str = "";
            i11 = 1;
            if (this.c != 1) {
                this.b.a = new gj0(R.raw.call_mute, str + R.raw.call_mute, dp, dp, true, null);
                this.b.b = new gj0(R.raw.call_mute, str + R.raw.call_mute, dp, dp, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                j3 j3Var = this.b;
                j3Var.b.s0 = j3Var;
            }
        } else if (b10 != 1) {
            if (b10 != 2) {
                if (b10 == 3) {
                    int i12 = this.c;
                    if (i12 == 5) {
                        j3 j3Var2 = this.b;
                        z11 = z4 == j3Var2.v;
                        gj0 gj0Var = z4 ? j3Var2.b : j3Var2.a;
                        gj0Var.s0 = j3Var2;
                        gj0Var.r0 = new f3(this, dp, 1);
                        gj0Var.start();
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
                } else if (b10 == 4) {
                    int i13 = this.c;
                    if (i13 == 4) {
                        j3 j3Var3 = this.b;
                        z11 = z4 == j3Var3.v;
                        gj0 gj0Var2 = z4 ? j3Var3.b : j3Var3.a;
                        gj0Var2.s0 = j3Var3;
                        gj0Var2.r0 = new f3(this, dp, 0);
                        gj0Var2.start();
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
                int b11 = m1.j.b(i10);
                string = b11 != 0 ? b11 != i11 ? b11 != 2 ? b11 != 3 ? b11 != 4 ? str : LocaleController.getString(R.string.VoipSpeaker) : LocaleController.getString(R.string.VoipAudioRoutingBluetooth) : z4 ? LocaleController.getString(R.string.VoipStartVideo) : LocaleController.getString(R.string.VoipStopVideo) : LocaleController.getString(R.string.VoipFlip) : z4 ? LocaleController.getString(R.string.VoipUnmute) : LocaleController.getString(R.string.VoipMute);
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
            if (this.c != 3) {
                str = "";
                i11 = 1;
                this.b.a = new gj0(R.raw.video_stop, "" + R.raw.video_stop, dp, dp, true, null);
                this.b.b = new gj0(R.raw.video_stop, str + R.raw.video_stop, dp, dp, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                j3 j3Var4 = this.b;
                j3Var4.b.s0 = j3Var4;
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
                int b112 = m1.j.b(i10);
                if (b112 != 0) {
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
            if (i14 != 2) {
                this.b.c = new gj0(R.raw.camera_flip2, str + R.raw.camera_flip2, dp, dp, true, null);
                j3 j3Var5 = this.b;
                j3Var5.c.s0 = j3Var5;
            }
        }
        z12 = false;
        if (!z12) {
        }
        int b1122 = m1.j.b(i10);
        if (b1122 != 0) {
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

    public void setOnBtnClickedListener(i3 i3Var) {
        this.b.setOnBtnClickedListener(i3Var);
    }
}
