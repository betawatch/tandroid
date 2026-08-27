package nh;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class h0 extends cb {
    public final c6 a;
    public final e0 b;
    public final g0 c;
    public final TextView d;
    public final TextView e;
    public i0 f;
    public int h;

    public h0(Context context, c6 c6Var) {
        super(context, c6Var);
        this.h = 0;
        this.a = c6Var;
        e0 e0Var = new e0(AndroidUtilities.dp(10.0f));
        e0Var.a.setColor(g6.v0(g6.Fi, c6Var));
        this.b = e0Var;
        setBackground(e0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        g0 g0Var = new g0(context, imageView);
        this.c = g0Var;
        imageView.setImageDrawable(g0Var);
        addView(imageView, z5.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, z5.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = g6.Hi;
        textView.setTextColor(g6.v0(i10, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView i11 = pa.i(linearLayout, textView, z5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = i11;
        i11.setTextSize(1, 13.0f);
        i11.setTextColor(g6.v0(i10, c6Var));
        linearLayout.addView(i11, z5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
        if (i10 == 0) {
            setButton((bb) null);
            return;
        }
        c6 c6Var = this.a;
        if (i10 == 1) {
            cc ccVar = new cc(getContext(), c6Var, true);
            ccVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
            final int i11 = 0;
            ccVar.a = new Runnable(this) { // from class: nh.d0
                public final /* synthetic */ h0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i11) {
                        case 0:
                            h0 h0Var = this.b;
                            ec bulletin = h0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            i0 i0Var = h0Var.f;
                            if (i0Var != null) {
                                i0Var.a();
                                break;
                            }
                            break;
                        default:
                            h0 h0Var2 = this.b;
                            ec bulletin2 = h0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            i0 i0Var2 = h0Var2.f;
                            if (i0Var2 != null && (file = i0Var2.d) != null && file.exists()) {
                                File file2 = i0Var2.d;
                                AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.C1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                ccVar.c = getBulletin();
            }
            setButton(ccVar);
            return;
        }
        if (i10 == 2) {
            cc ccVar2 = new cc(getContext(), c6Var, true);
            ccVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
            final int i12 = 1;
            ccVar2.a = new Runnable(this) { // from class: nh.d0
                public final /* synthetic */ h0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i12) {
                        case 0:
                            h0 h0Var = this.b;
                            ec bulletin = h0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            i0 i0Var = h0Var.f;
                            if (i0Var != null) {
                                i0Var.a();
                                break;
                            }
                            break;
                        default:
                            h0 h0Var2 = this.b;
                            ec bulletin2 = h0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            i0 i0Var2 = h0Var2.f;
                            if (i0Var2 != null && (file = i0Var2.d) != null && file.exists()) {
                                File file2 = i0Var2.d;
                                AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.C1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                ccVar2.c = getBulletin();
            }
            setButton(ccVar2);
        }
    }

    public final boolean c(i0 i0Var) {
        i0 i0Var2 = this.f;
        g0 g0Var = this.c;
        if (i0Var2 != i0Var) {
            y5 y5Var = g0Var.k;
            g0Var.h = false;
            y5Var.getClass();
            y5Var.d(0.0f, true);
            oi0 oi0Var = g0Var.l;
            if (oi0Var != null) {
                oi0Var.A(true);
                g0Var.l = null;
            }
            y5 y5Var2 = g0Var.i;
            g0Var.f = false;
            y5Var2.getClass();
            y5Var2.d(0.0f, true);
        }
        this.f = i0Var;
        this.d.setText(i0Var.c);
        boolean c10 = i0Var.c();
        TextView textView = this.e;
        if (c10) {
            Pair b10 = i0Var.b();
            g0Var.getClass();
            boolean z10 = ((Long) b10.second).longValue() > 0;
            g0Var.f = z10;
            if (z10) {
                g0Var.g = Utilities.clamp(((Long) b10.first).longValue() / ((Long) b10.second).longValue(), 1.0f, 0.0f);
            }
            g0Var.invalidateSelf();
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
        if (i0Var.i) {
            ec bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        }
        if (i0Var.h) {
            textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
            setButton(2);
            if (!g0Var.h) {
                g0Var.h = true;
                oi0 oi0Var2 = new oi0(R.raw.contact_check, AndroidUtilities.dp(40.0f), "contact_check", AndroidUtilities.dp(40.0f));
                g0Var.l = oi0Var2;
                oi0Var2.r0 = g0Var.a;
                oi0Var2.H(true);
                g0Var.l.start();
                g0Var.g = 1.0f;
            }
            ec bulletin2 = getBulletin();
            if (bulletin2 != null) {
                bulletin2.i(false);
                bulletin2.j = 5000;
                bulletin2.i(true);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.cb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), TLObject.FLAG_30));
    }

    public void setArrow(int i10) {
        e0 e0Var = this.b;
        e0Var.getClass();
        boolean z10 = i10 >= 0;
        e0Var.e = z10;
        if (z10) {
            e0Var.f = i10;
        }
        e0Var.invalidateSelf();
    }
}
