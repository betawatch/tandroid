package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.vv0;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k3 extends FrameLayout {
    public final p1 a;
    public j3 b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public k3(Activity activity, p1 p1Var) {
        super(activity);
        this.a = p1Var;
        setWillNotDraw(true);
        j3 j3Var = new j3(activity, p1Var);
        this.b = j3Var;
        addView(j3Var, a6.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, a6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, a6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i10) {
        this.b.a = new hj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b = new hj0(R.raw.bt_to_speaker, i10, i10, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i10, int i11, int i12, boolean z10) {
        j3 j3Var = new j3(getContext(), this.a);
        if (i10 == R.raw.camera_flip2) {
            hj0 hj0Var = new hj0(i10, i11, i11, true, null);
            j3Var.c = hj0Var;
            hj0Var.v0 = j3Var;
        } else {
            j3Var.a = new hj0(i10, i11, i11, true, null);
            hj0 hj0Var2 = new hj0(i10, i11, i11, true, null);
            j3Var.b = hj0Var2;
            hj0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        j3Var.a(i12, z10, false);
        j3Var.setAlpha(0.0f);
        j3Var.setOnBtnClickedListener(this.b.x);
        addView(j3Var, a6.a(53.5f, 53.5f, 1));
        j3 j3Var2 = this.b;
        this.b = j3Var;
        j3Var.animate().alpha(1.0f).setDuration(250L).start();
        j3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new vv0(3, (Object) this, (Object) j3Var2)).start();
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
                    this.b.c = new hj0(R.raw.camera_flip2, dp, dp, true, null);
                    j3 j3Var = this.b;
                    j3Var.c.v0 = j3Var;
                }
            } else if (c10 != 2) {
                if (c10 == 3) {
                    int i12 = this.c;
                    if (i12 == 5) {
                        j3 j3Var2 = this.b;
                        z12 = z10 == j3Var2.v;
                        hj0 hj0Var = z10 ? j3Var2.b : j3Var2.a;
                        hj0Var.v0 = j3Var2;
                        hj0Var.u0 = new f3(this, dp, 1);
                        hj0Var.start();
                    } else if (i12 == 2) {
                        b(R.raw.bt_to_speaker, dp, i10, z10);
                        z12 = true;
                    } else if (i12 != 4) {
                        a(dp);
                    }
                } else if (c10 == 4) {
                    int i13 = this.c;
                    if (i13 == 4) {
                        j3 j3Var3 = this.b;
                        z12 = z10 == j3Var3.v;
                        hj0 hj0Var2 = z10 ? j3Var3.b : j3Var3.a;
                        hj0Var2.v0 = j3Var3;
                        hj0Var2.u0 = new f3(this, dp, 0);
                        hj0Var2.start();
                    } else if (i13 == 2) {
                        b(R.raw.speaker_to_bt, dp, i10, z10);
                        z12 = true;
                    } else if (i13 != 5) {
                        c(dp);
                    }
                }
            } else if (this.c != 3) {
                this.b.a = new hj0(R.raw.video_stop, dp, dp, true, null);
                this.b.b = new hj0(R.raw.video_stop, dp, dp, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                j3 j3Var4 = this.b;
                j3Var4.b.v0 = j3Var4;
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
                textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new vv0(2, (Object) this, (Object) string)).start();
                textView2.setText(string);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(AndroidUtilities.dp(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new v2(this, 2)).start();
            }
            this.c = i10;
        }
        if (this.c != 1) {
            this.b.a = new hj0(R.raw.call_mute, dp, dp, true, null);
            this.b.b = new hj0(R.raw.call_mute, dp, dp, true, null);
            this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            j3 j3Var5 = this.b;
            j3Var5.b.v0 = j3Var5;
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
        textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new vv0(2, (Object) this, (Object) string)).start();
        textView2.setText(string);
        textView2.setVisibility(0);
        textView2.setAlpha(0.0f);
        textView2.setTranslationY(AndroidUtilities.dp(5.0f));
        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new v2(this, 2)).start();
        this.c = i10;
    }

    public void setOnBtnClickedListener(i3 i3Var) {
        this.b.setOnBtnClickedListener(i3Var);
    }
}
