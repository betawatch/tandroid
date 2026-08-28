package mh;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class i0 extends eb {
    public final b6 a;
    public final g0 b;
    public final h0 c;
    public final TextView d;
    public final TextView e;
    public j0 f;
    public int h;

    public i0(Context context, b6 b6Var) {
        super(context, b6Var);
        this.h = 0;
        this.a = b6Var;
        g0 g0Var = new g0(AndroidUtilities.dp(10.0f));
        g0Var.a.setColor(f6.v0(f6.Fi, b6Var));
        this.b = g0Var;
        setBackground(g0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        h0 h0Var = new h0(context, imageView);
        this.c = h0Var;
        imageView.setImageDrawable(h0Var);
        addView(imageView, e6.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, e6.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i9 = f6.Hi;
        textView.setTextColor(f6.v0(i9, b6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = j3.r0.h(linearLayout, textView, e6.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(f6.v0(i9, b6Var));
        linearLayout.addView(h, e6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i9) {
        if (this.h == i9) {
            return;
        }
        this.h = i9;
        if (i9 == 0) {
            setButton((db) null);
            return;
        }
        b6 b6Var = this.a;
        if (i9 == 1) {
            ec ecVar = new ec(getContext(), b6Var, true);
            ecVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
            final int i10 = 0;
            ecVar.a = new Runnable(this) { // from class: mh.f0
                public final /* synthetic */ i0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i10) {
                        case 0:
                            i0 i0Var = this.b;
                            gc bulletin = i0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            j0 j0Var = i0Var.f;
                            if (j0Var != null) {
                                j0Var.a();
                                break;
                            }
                            break;
                        default:
                            i0 i0Var2 = this.b;
                            gc bulletin2 = i0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            j0 j0Var2 = i0Var2.f;
                            if (j0Var2 != null && (file = j0Var2.d) != null && file.exists()) {
                                File file2 = j0Var2.d;
                                AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.C1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                ecVar.c = getBulletin();
            }
            setButton(ecVar);
            return;
        }
        if (i9 == 2) {
            ec ecVar2 = new ec(getContext(), b6Var, true);
            ecVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
            final int i11 = 1;
            ecVar2.a = new Runnable(this) { // from class: mh.f0
                public final /* synthetic */ i0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i11) {
                        case 0:
                            i0 i0Var = this.b;
                            gc bulletin = i0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            j0 j0Var = i0Var.f;
                            if (j0Var != null) {
                                j0Var.a();
                                break;
                            }
                            break;
                        default:
                            i0 i0Var2 = this.b;
                            gc bulletin2 = i0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            j0 j0Var2 = i0Var2.f;
                            if (j0Var2 != null && (file = j0Var2.d) != null && file.exists()) {
                                File file2 = j0Var2.d;
                                AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.C1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                ecVar2.c = getBulletin();
            }
            setButton(ecVar2);
        }
    }

    public final boolean c(j0 j0Var) {
        j0 j0Var2 = this.f;
        h0 h0Var = this.c;
        if (j0Var2 != j0Var) {
            y5 y5Var = h0Var.k;
            h0Var.h = false;
            y5Var.getClass();
            y5Var.d(0.0f, true);
            mi0 mi0Var = h0Var.l;
            if (mi0Var != null) {
                mi0Var.A(true);
                h0Var.l = null;
            }
            y5 y5Var2 = h0Var.i;
            h0Var.f = false;
            y5Var2.getClass();
            y5Var2.d(0.0f, true);
        }
        this.f = j0Var;
        this.d.setText(j0Var.c);
        boolean c10 = j0Var.c();
        TextView textView = this.e;
        if (c10) {
            Pair b10 = j0Var.b();
            h0Var.getClass();
            boolean z10 = ((Long) b10.second).longValue() > 0;
            h0Var.f = z10;
            if (z10) {
                h0Var.g = Utilities.clamp(((Long) b10.first).longValue() / ((Long) b10.second).longValue(), 1.0f, 0.0f);
            }
            h0Var.invalidateSelf();
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
        if (j0Var.i) {
            gc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        }
        if (j0Var.h) {
            textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
            setButton(2);
            if (!h0Var.h) {
                h0Var.h = true;
                mi0 mi0Var2 = new mi0(R.raw.contact_check, AndroidUtilities.dp(40.0f), "contact_check", AndroidUtilities.dp(40.0f));
                h0Var.l = mi0Var2;
                mi0Var2.r0 = h0Var.a;
                mi0Var2.H(true);
                h0Var.l.start();
                h0Var.g = 1.0f;
            }
            gc bulletin2 = getBulletin();
            if (bulletin2 != null) {
                bulletin2.i(false);
                bulletin2.j = 5000;
                bulletin2.i(true);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.eb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), TLObject.FLAG_30));
    }

    public void setArrow(int i9) {
        g0 g0Var = this.b;
        g0Var.getClass();
        boolean z10 = i9 >= 0;
        g0Var.e = z10;
        if (z10) {
            g0Var.f = i9;
        }
        g0Var.invalidateSelf();
    }
}
