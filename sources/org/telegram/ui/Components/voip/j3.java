package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.su0;
import org.telegram.ui.Components.y11;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j3 extends FrameLayout {
    public final n1 a;
    public i3 b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public j3(Activity activity, n1 n1Var) {
        super(activity);
        this.a = n1Var;
        setWillNotDraw(true);
        i3 i3Var = new i3(activity, n1Var);
        this.b = i3Var;
        addView(i3Var, e6.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, e6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, e6.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i9) {
        this.b.a = new mi0(R.raw.bt_to_speaker, "" + R.raw.bt_to_speaker, i9, i9, true, null);
        this.b.b = new mi0(R.raw.bt_to_speaker, "" + R.raw.bt_to_speaker, i9, i9, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i9, int i10, int i11, boolean z10) {
        i3 i3Var = new i3(getContext(), this.a);
        if (i9 == R.raw.camera_flip2) {
            mi0 mi0Var = new mi0(i9, j3.r0.l(i9, ""), i10, i10, true, null);
            i3Var.c = mi0Var;
            mi0Var.r0 = i3Var;
        } else {
            i3Var.a = new mi0(i9, j3.r0.l(i9, ""), i10, i10, true, null);
            mi0 mi0Var2 = new mi0(i9, j3.r0.l(i9, ""), i10, i10, true, null);
            i3Var.b = mi0Var2;
            mi0Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        i3Var.a(i11, z10, false);
        i3Var.setAlpha(0.0f);
        i3Var.setOnBtnClickedListener(this.b.x);
        addView(i3Var, e6.a(53.5f, 53.5f, 1));
        i3 i3Var2 = this.b;
        this.b = i3Var;
        i3Var.animate().alpha(1.0f).setDuration(250L).start();
        i3Var2.animate().alpha(0.0f).setDuration(250L).setListener(new su0(3, this, i3Var2)).start();
    }

    public final void c(int i9) {
        this.b.a = new mi0(R.raw.speaker_to_bt, "" + R.raw.speaker_to_bt, i9, i9, true, null);
        this.b.b = new mi0(R.raw.speaker_to_bt, "" + R.raw.speaker_to_bt, i9, i9, true, null);
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
    public final void d(int i9, boolean z10, boolean z11) {
        String str;
        int i10;
        String string;
        TextView textView;
        int visibility;
        TextView textView2;
        boolean z12;
        if (this.c == i9 && z10 == this.b.v) {
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
        int b10 = m1.j.b(i9);
        boolean z13 = true;
        if (b10 == 0) {
            str = "";
            i10 = 1;
            if (this.c != 1) {
                this.b.a = new mi0(R.raw.call_mute, str + R.raw.call_mute, dp, dp, true, null);
                this.b.b = new mi0(R.raw.call_mute, str + R.raw.call_mute, dp, dp, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                i3 i3Var = this.b;
                i3Var.b.r0 = i3Var;
            }
        } else if (b10 != 1) {
            if (b10 != 2) {
                if (b10 == 3) {
                    int i11 = this.c;
                    if (i11 == 5) {
                        i3 i3Var2 = this.b;
                        z12 = z10 == i3Var2.v;
                        mi0 mi0Var = z10 ? i3Var2.b : i3Var2.a;
                        mi0Var.r0 = i3Var2;
                        mi0Var.q0 = new e3(this, dp, 1);
                        mi0Var.start();
                        str = "";
                        z13 = z12;
                        i10 = 1;
                    } else if (i11 == 2) {
                        b(R.raw.bt_to_speaker, dp, i9, z10);
                        str = "";
                        i10 = 1;
                    } else if (i11 != 4) {
                        a(dp);
                    }
                } else if (b10 == 4) {
                    int i12 = this.c;
                    if (i12 == 4) {
                        i3 i3Var3 = this.b;
                        z12 = z10 == i3Var3.v;
                        mi0 mi0Var2 = z10 ? i3Var3.b : i3Var3.a;
                        mi0Var2.r0 = i3Var3;
                        mi0Var2.q0 = new e3(this, dp, 0);
                        mi0Var2.start();
                        str = "";
                        z13 = z12;
                        i10 = 1;
                    } else if (i12 == 2) {
                        b(R.raw.speaker_to_bt, dp, i9, z10);
                        str = "";
                        i10 = 1;
                    } else if (i12 != 5) {
                        c(dp);
                    }
                }
                if (!z13) {
                    this.b.a(i9, z10, (this.c == 0 || z11) ? false : true);
                }
                int b11 = m1.j.b(i9);
                string = b11 != 0 ? b11 != i10 ? b11 != 2 ? b11 != 3 ? b11 != 4 ? str : LocaleController.getString(R.string.VoipSpeaker) : LocaleController.getString(R.string.VoipAudioRoutingBluetooth) : z10 ? LocaleController.getString(R.string.VoipStartVideo) : LocaleController.getString(R.string.VoipStopVideo) : LocaleController.getString(R.string.VoipFlip) : z10 ? LocaleController.getString(R.string.VoipUnmute) : LocaleController.getString(R.string.VoipMute);
                setContentDescription(string);
                textView = this.d;
                visibility = textView.getVisibility();
                textView2 = this.e;
                if (visibility != 8 && textView2.getVisibility() == 8) {
                    textView.setVisibility(0);
                    textView.setText(string);
                    textView2.setText(string);
                } else if (textView2.getText().equals(string) || !textView.getText().equals(string)) {
                    textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new su0(2, this, string)).start();
                    textView2.setText(string);
                    textView2.setVisibility(0);
                    textView2.setAlpha(0.0f);
                    textView2.setTranslationY(AndroidUtilities.dp(5.0f));
                    textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new y11(this, 18)).start();
                }
                this.c = i9;
            }
            if (this.c != 3) {
                str = "";
                i10 = 1;
                this.b.a = new mi0(R.raw.video_stop, "" + R.raw.video_stop, dp, dp, true, null);
                this.b.b = new mi0(R.raw.video_stop, str + R.raw.video_stop, dp, dp, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                i3 i3Var4 = this.b;
                i3Var4.b.r0 = i3Var4;
            }
            str = "";
            i10 = 1;
        } else {
            str = "";
            i10 = 1;
            int i13 = this.c;
            if (i13 == 5 || i13 == 4) {
                b(R.raw.camera_flip2, dp, i9, z10);
                z13 = true;
                if (!z13) {
                }
                int b112 = m1.j.b(i9);
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
                textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new su0(2, this, string)).start();
                textView2.setText(string);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(AndroidUtilities.dp(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new y11(this, 18)).start();
                this.c = i9;
            }
            if (i13 != 2) {
                this.b.c = new mi0(R.raw.camera_flip2, str + R.raw.camera_flip2, dp, dp, true, null);
                i3 i3Var5 = this.b;
                i3Var5.c.r0 = i3Var5;
            }
        }
        z13 = false;
        if (!z13) {
        }
        int b1122 = m1.j.b(i9);
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
        textView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new su0(2, this, string)).start();
        textView2.setText(string);
        textView2.setVisibility(0);
        textView2.setAlpha(0.0f);
        textView2.setTranslationY(AndroidUtilities.dp(5.0f));
        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new y11(this, 18)).start();
        this.c = i9;
    }

    public void setOnBtnClickedListener(h3 h3Var) {
        this.b.setOnBtnClickedListener(h3Var);
    }
}
