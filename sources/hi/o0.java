package hi;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o0 extends nb {
    public final u6 a;
    public final m0 b;
    public final n0 c;
    public final TextView d;
    public final TextView e;
    public p0 f;
    public int h;

    public o0(Context context, u6 u6Var) {
        super(context, u6Var);
        this.h = 0;
        this.a = u6Var;
        m0 m0Var = new m0(AndroidUtilities.dp(10.0f));
        m0Var.a.setColor(y6.w0(y6.Fi, u6Var));
        this.b = m0Var;
        setBackground(m0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        n0 n0Var = new n0(context, imageView);
        this.c = n0Var;
        imageView.setImageDrawable(n0Var);
        addView(imageView, kb1.h(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, kb1.h(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = y6.Hi;
        f7.V(textView, i10, u6Var);
        textView.setTypeface(AndroidUtilities.bold());
        TextView e = wh.e(linearLayout, textView, kb1.x(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = e;
        e.setTextSize(1, 13.0f);
        f7.V(e, i10, u6Var);
        linearLayout.addView(e, kb1.x(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
        if (i10 == 0) {
            setButton((mb) null);
            return;
        }
        u6 u6Var = this.a;
        if (i10 == 1) {
            oc ocVar = new oc(getContext(), u6Var, true);
            ocVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
            final int i11 = 0;
            ocVar.b = new Runnable(this) { // from class: hi.l0
                public final /* synthetic */ o0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i11) {
                        case 0:
                            o0 o0Var = this.b;
                            qc bulletin = o0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            p0 p0Var = o0Var.f;
                            if (p0Var != null) {
                                p0Var.a();
                                break;
                            }
                            break;
                        default:
                            o0 o0Var2 = this.b;
                            qc bulletin2 = o0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            p0 p0Var2 = o0Var2.f;
                            if (p0Var2 != null && (file = p0Var2.d) != null && file.exists()) {
                                File file2 = p0Var2.d;
                                AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.I1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                ocVar.d = getBulletin();
            }
            setButton(ocVar);
            return;
        }
        if (i10 == 2) {
            oc ocVar2 = new oc(getContext(), u6Var, true);
            ocVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
            final int i12 = 1;
            ocVar2.b = new Runnable(this) { // from class: hi.l0
                public final /* synthetic */ o0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i12) {
                        case 0:
                            o0 o0Var = this.b;
                            qc bulletin = o0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            p0 p0Var = o0Var.f;
                            if (p0Var != null) {
                                p0Var.a();
                                break;
                            }
                            break;
                        default:
                            o0 o0Var2 = this.b;
                            qc bulletin2 = o0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            p0 p0Var2 = o0Var2.f;
                            if (p0Var2 != null && (file = p0Var2.d) != null && file.exists()) {
                                File file2 = p0Var2.d;
                                AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.I1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                ocVar2.d = getBulletin();
            }
            setButton(ocVar2);
        }
    }

    public final boolean c(p0 p0Var) {
        p0 p0Var2 = this.f;
        n0 n0Var = this.c;
        if (p0Var2 != p0Var) {
            h6 h6Var = n0Var.k;
            n0Var.h = false;
            h6Var.getClass();
            h6Var.d(0.0f, true);
            yj0 yj0Var = n0Var.l;
            if (yj0Var != null) {
                yj0Var.C(true);
                n0Var.l = null;
            }
            h6 h6Var2 = n0Var.i;
            n0Var.f = false;
            h6Var2.getClass();
            h6Var2.d(0.0f, true);
        }
        this.f = p0Var;
        this.d.setText(p0Var.c);
        boolean c10 = p0Var.c();
        TextView textView = this.e;
        if (c10) {
            Pair b10 = p0Var.b();
            n0Var.getClass();
            boolean z10 = ((Long) b10.second).longValue() > 0;
            n0Var.f = z10;
            if (z10) {
                n0Var.g = Utilities.clamp(((Long) b10.first).longValue() / ((Long) b10.second).longValue(), 1.0f, 0.0f);
            }
            n0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloading));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
            } else {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
            }
            setButton(1);
            return false;
        }
        if (p0Var.i) {
            qc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        }
        if (p0Var.h) {
            textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
            setButton(2);
            if (!n0Var.h) {
                n0Var.h = true;
                yj0 yj0Var2 = new yj0(R.raw.contact_check, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                n0Var.l = yj0Var2;
                yj0Var2.R(n0Var.a);
                n0Var.l.J(true);
                n0Var.l.start();
                n0Var.g = 1.0f;
            }
            qc bulletin2 = getBulletin();
            if (bulletin2 != null) {
                bulletin2.i(false);
                bulletin2.j = 5000;
                bulletin2.i(true);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.nb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), TLObject.FLAG_30));
    }

    public void setArrow(int i10) {
        m0 m0Var = this.b;
        m0Var.getClass();
        boolean z10 = i10 >= 0;
        m0Var.e = z10;
        if (z10) {
            m0Var.f = i10;
        }
        m0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.ub, org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        super.updateColors();
        m0 m0Var = this.b;
        if (m0Var != null) {
            try {
                m0Var.a.setColor(y6.w0(y6.Fi, this.a));
                m0Var.invalidateSelf();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
