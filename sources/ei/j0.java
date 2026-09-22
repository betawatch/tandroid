package ei;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.LaunchActivity;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class j0 extends mb {
    public final f6 a;
    public final h0 b;
    public final i0 c;
    public final TextView d;
    public final TextView e;
    public k0 f;
    public int h;

    public j0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.h = 0;
        this.a = f6Var;
        h0 h0Var = new h0(AndroidUtilities.dp(10.0f));
        h0Var.a.setColor(j6.v0(j6.Fi, f6Var));
        this.b = h0Var;
        setBackground(h0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        i0 i0Var = new i0(context, imageView);
        this.c = i0Var;
        imageView.setImageDrawable(i0Var);
        addView(imageView, y5.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, y5.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = j6.Hi;
        textView.setTextColor(j6.v0(i10, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, y5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(j6.v0(i10, f6Var));
        linearLayout.addView(h, y5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h == i10) {
            return;
        }
        this.h = i10;
        if (i10 == 0) {
            setButton((lb) null);
            return;
        }
        f6 f6Var = this.a;
        if (i10 == 1) {
            nc ncVar = new nc(getContext(), f6Var, true);
            ncVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
            final int i11 = 0;
            ncVar.a = new Runnable(this) { // from class: ei.g0
                public final /* synthetic */ j0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i11) {
                        case 0:
                            j0 j0Var = this.b;
                            pc bulletin = j0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            k0 k0Var = j0Var.f;
                            if (k0Var != null) {
                                k0Var.a();
                                break;
                            }
                            break;
                        default:
                            j0 j0Var2 = this.b;
                            pc bulletin2 = j0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            k0 k0Var2 = j0Var2.f;
                            if (k0Var2 != null && (file = k0Var2.d) != null && file.exists()) {
                                File file2 = k0Var2.d;
                                AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                ncVar.c = getBulletin();
            }
            setButton(ncVar);
            return;
        }
        if (i10 == 2) {
            nc ncVar2 = new nc(getContext(), f6Var, true);
            ncVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
            final int i12 = 1;
            ncVar2.a = new Runnable(this) { // from class: ei.g0
                public final /* synthetic */ j0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i12) {
                        case 0:
                            j0 j0Var = this.b;
                            pc bulletin = j0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            k0 k0Var = j0Var.f;
                            if (k0Var != null) {
                                k0Var.a();
                                break;
                            }
                            break;
                        default:
                            j0 j0Var2 = this.b;
                            pc bulletin2 = j0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            k0 k0Var2 = j0Var2.f;
                            if (k0Var2 != null && (file = k0Var2.d) != null && file.exists()) {
                                File file2 = k0Var2.d;
                                AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                ncVar2.c = getBulletin();
            }
            setButton(ncVar2);
        }
    }

    public final boolean c(k0 k0Var) {
        k0 k0Var2 = this.f;
        i0 i0Var = this.c;
        if (k0Var2 != k0Var) {
            d6 d6Var = i0Var.k;
            i0Var.h = false;
            d6Var.getClass();
            d6Var.d(0.0f, true);
            kj0 kj0Var = i0Var.l;
            if (kj0Var != null) {
                kj0Var.C(true);
                i0Var.l = null;
            }
            d6 d6Var2 = i0Var.i;
            i0Var.f = false;
            d6Var2.getClass();
            d6Var2.d(0.0f, true);
        }
        this.f = k0Var;
        this.d.setText(k0Var.c);
        boolean c10 = k0Var.c();
        TextView textView = this.e;
        if (c10) {
            Pair b10 = k0Var.b();
            i0Var.getClass();
            boolean z10 = ((Long) b10.second).longValue() > 0;
            i0Var.f = z10;
            if (z10) {
                i0Var.g = Utilities.clamp(((Long) b10.first).longValue() / ((Long) b10.second).longValue(), 1.0f, 0.0f);
            }
            i0Var.invalidateSelf();
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
        if (k0Var.i) {
            pc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        }
        if (k0Var.h) {
            textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
            setButton(2);
            if (!i0Var.h) {
                i0Var.h = true;
                kj0 kj0Var2 = new kj0(R.raw.contact_check, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                i0Var.l = kj0Var2;
                kj0Var2.R(i0Var.a);
                i0Var.l.J(true);
                i0Var.l.start();
                i0Var.g = 1.0f;
            }
            pc bulletin2 = getBulletin();
            if (bulletin2 != null) {
                bulletin2.i(false);
                bulletin2.j = 5000;
                bulletin2.i(true);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.mb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), TLObject.FLAG_30));
    }

    public void setArrow(int i10) {
        h0 h0Var = this.b;
        h0Var.getClass();
        boolean z10 = i10 >= 0;
        h0Var.e = z10;
        if (z10) {
            h0Var.f = i10;
        }
        h0Var.invalidateSelf();
    }
}
