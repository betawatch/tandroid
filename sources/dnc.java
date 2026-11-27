// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dnc extends FrameLayout {
    public final kjc a;
    public cnc b;
    public int c;
    public final TextView d;
    public final TextView e;
    public int f;

    public dnc(Activity activity, kjc kjcVar) {
        super(activity);
        this.a = kjcVar;
        setWillNotDraw(true);
        cnc cncVar = new cnc(activity, kjcVar);
        this.b = cncVar;
        addView(cncVar, tre.a(53.5f, 53.5f, 1));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, tre.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(activity);
        this.e = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, tre.d(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public final void a(int i) {
        this.b.a = new b29(R.raw.bt_to_speaker, i, i, true, null);
        this.b.b = new b29(R.raw.bt_to_speaker, i, i, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public final void b(int i, int i2, int i3, boolean z) {
        cnc cncVar = new cnc(getContext(), this.a);
        if (i == R.raw.camera_flip2) {
            b29 b29Var = new b29(i, i2, i2, true, null);
            cncVar.c = b29Var;
            b29Var.M(cncVar);
        } else {
            cncVar.a = new b29(i, i2, i2, true, null);
            b29 b29Var2 = new b29(i, i2, i2, true, null);
            cncVar.b = b29Var2;
            b29Var2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        cncVar.a(i3, z, false);
        cncVar.setAlpha(0.0f);
        cncVar.setOnBtnClickedListener(this.b.y);
        addView(cncVar, tre.a(53.5f, 53.5f, 1));
        cnc cncVar2 = this.b;
        this.b = cncVar;
        cncVar.animate().alpha(1.0f).setDuration(250L).start();
        cncVar2.animate().alpha(0.0f).setDuration(250L).setListener(new wd8((Object) this, (Object) cncVar2, (byte) 24)).start();
    }

    public final void c(int i) {
        this.b.a = new b29(R.raw.speaker_to_bt, i, i, true, null);
        this.b.b = new b29(R.raw.speaker_to_bt, i, i, true, null);
        this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, boolean z, boolean z2) {
        boolean z3;
        String M0;
        TextView textView;
        int visibility;
        TextView textView2;
        if (this.c == i && z == this.b.w) {
            if (getVisibility() != 0) {
                setVisibility(0);
                return;
            }
            return;
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        int L = hl.L(53.5f);
        int F = ik8.F(i);
        if (F != 0) {
            if (F == 1) {
                int i2 = this.c;
                if (i2 == 5 || i2 == 4) {
                    b(R.raw.camera_flip2, L, i, z);
                    z3 = true;
                } else if (i2 != 2) {
                    this.b.c = new b29(R.raw.camera_flip2, L, L, true, null);
                    cnc cncVar = this.b;
                    cncVar.c.M(cncVar);
                }
            } else if (F != 2) {
                if (F == 3) {
                    int i3 = this.c;
                    if (i3 == 5) {
                        cnc cncVar2 = this.b;
                        z3 = z == cncVar2.w;
                        b29 b29Var = z ? cncVar2.b : cncVar2.a;
                        b29Var.M(cncVar2);
                        b29Var.u0 = new ymc(this, L, (byte) 1);
                        b29Var.start();
                    } else if (i3 == 2) {
                        b(R.raw.bt_to_speaker, L, i, z);
                        z3 = true;
                    } else if (i3 != 4) {
                        a(L);
                    }
                } else if (F == 4) {
                    int i4 = this.c;
                    if (i4 == 4) {
                        cnc cncVar3 = this.b;
                        z3 = z == cncVar3.w;
                        b29 b29Var2 = z ? cncVar3.b : cncVar3.a;
                        b29Var2.M(cncVar3);
                        b29Var2.u0 = new ymc(this, L, (byte) 0);
                        b29Var2.start();
                    } else if (i4 == 2) {
                        b(R.raw.speaker_to_bt, L, i, z);
                        z3 = true;
                    } else if (i4 != 5) {
                        c(L);
                    }
                }
            } else if (this.c != 3) {
                this.b.a = new b29(R.raw.video_stop, L, L, true, null);
                this.b.b = new b29(R.raw.video_stop, L, L, true, null);
                this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                cnc cncVar4 = this.b;
                cncVar4.b.M(cncVar4);
            }
            if (!z3) {
                this.b.a(i, z, (this.c == 0 || z2) ? false : true);
            }
            int F2 = ik8.F(i);
            M0 = F2 == 0 ? F2 != 1 ? F2 != 2 ? F2 != 3 ? F2 != 4 ? "" : ob6.M0(2131742891, null) : ob6.M0(2131743155, null) : z ? ob6.M0(2131742890, null) : ob6.M0(2131742889, null) : ob6.M0(2131743058, null) : z ? ob6.M0(2131742882, null) : ob6.M0(2131742945, null);
            setContentDescription(M0);
            textView = this.d;
            visibility = textView.getVisibility();
            textView2 = this.e;
            if (visibility != 8 && textView2.getVisibility() == 8) {
                textView.setVisibility(0);
                textView.setText(M0);
                textView2.setText(M0);
            } else if (textView2.getText().equals(M0) || !textView.getText().equals(M0)) {
                textView.animate().alpha(0.0f).translationY(-hl.L(4.0f)).setDuration(140L).setListener(new wd8(this, M0, (byte) 23)).start();
                textView2.setText(M0);
                textView2.setVisibility(0);
                textView2.setAlpha(0.0f);
                textView2.setTranslationY(hl.L(5.0f));
                textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new omb(this, (byte) 23)).start();
            }
            this.c = i;
        }
        if (this.c != 1) {
            this.b.a = new b29(R.raw.call_mute, L, L, true, null);
            this.b.b = new b29(R.raw.call_mute, L, L, true, null);
            this.b.b.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            cnc cncVar5 = this.b;
            cncVar5.b.M(cncVar5);
        }
        z3 = false;
        if (!z3) {
        }
        int F22 = ik8.F(i);
        if (F22 == 0) {
        }
        setContentDescription(M0);
        textView = this.d;
        visibility = textView.getVisibility();
        textView2 = this.e;
        if (visibility != 8) {
        }
        if (textView2.getText().equals(M0)) {
        }
        textView.animate().alpha(0.0f).translationY(-hl.L(4.0f)).setDuration(140L).setListener(new wd8(this, M0, (byte) 23)).start();
        textView2.setText(M0);
        textView2.setVisibility(0);
        textView2.setAlpha(0.0f);
        textView2.setTranslationY(hl.L(5.0f));
        textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new omb(this, (byte) 23)).start();
        this.c = i;
    }

    public void setOnBtnClickedListener(bnc bncVar) {
        this.b.setOnBtnClickedListener(bncVar);
    }
}
