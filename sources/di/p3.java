package di;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class p3 extends tk0 {
    public final /* synthetic */ x3 c;

    public p3(x3 x3Var) {
        this.c = x3Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        x3 x3Var = this.c;
        if (x3Var.c0) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (x3Var.d0) {
            if (i11 >= 0 && i11 < x3Var.b0.size()) {
                return LocaleController.formatYearMont(((o8) x3Var.b0.get(i11)).d / 1000, true);
            }
            i11 -= x3Var.b0.size();
        }
        ArrayList arrayList = x3Var.f0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) x3Var.f0.get(i11)) == null) {
            return null;
        }
        long j3 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return LocaleController.formatYearMont(j3, true);
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        int k10 = k();
        float width = (ll0Var.getWidth() - ll0Var.getPaddingLeft()) - ll0Var.getPaddingRight();
        x3 x3Var = this.c;
        g3 g3Var = x3Var.e;
        float f10 = g3Var.J;
        int i10 = (int) (((int) (width / f10)) * x3Var.O);
        int ceil = (int) Math.ceil(k10 / f10);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, r2 - ((AndroidUtilities.displaySize.y - ll0Var.getPaddingTop()) - ll0Var.getPaddingBottom())), f7) / (ceil * i10)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, g3Var.J * round) + 2;
        iArr[1] = ll0Var.getPaddingTop() + ((int) ((lerp - round) * i10));
    }

    @Override // org.telegram.ui.Components.tk0
    public final float H(ll0 ll0Var) {
        int k10 = k();
        float width = (ll0Var.getWidth() - ll0Var.getPaddingLeft()) - ll0Var.getPaddingRight();
        float f7 = this.c.e.J;
        return (Math.max(0, ll0Var.computeVerticalScrollOffset() - r2.getPadding()) - ll0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f7)) * ((int) (((int) (width / f7)) * r2.O))) - (AndroidUtilities.displaySize.y - ll0Var.getPaddingTop()));
    }

    @Override // s4.h0
    public final int h() {
        return k() + 3;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0 || i10 == h() - 1) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    @Override // s4.h0
    public final int k() {
        x3 x3Var = this.c;
        ArrayList arrayList = x3Var.f0;
        int size = arrayList == null ? 0 : arrayList.size();
        return x3Var.c0 ? size + 1 : x3Var.d0 ? x3Var.b0.size() + size : size;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        x3 x3Var = this.c;
        ArrayList arrayList = x3Var.h0;
        ArrayList arrayList2 = x3Var.b0;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            ((t3) view).a = i10 == 0 ? x3Var.getPadding() : -1;
            return;
        }
        if (i11 == 2) {
            s3 s3Var = (s3) view;
            boolean z10 = i10 == 2;
            boolean z11 = i10 == 4;
            s3Var.U = z10;
            s3Var.V = z11;
            s3Var.M = new o3(this, s3Var, 0);
            s3Var.N = new o3(this, s3Var, 1);
            int i12 = i10 - 2;
            if (x3Var.c0) {
                if (i12 == 0) {
                    s3Var.f(-1, false, false);
                    s3Var.e(arrayList2.size(), (o8) arrayList2.get(0));
                    return;
                }
                i12 = i10 - 3;
            } else if (x3Var.d0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    s3Var.f(-1, false, false);
                    s3Var.e(0, (o8) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = x3Var.f0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) x3Var.f0.get(i12);
            s3Var.f(arrayList.indexOf(photoEntry), !arrayList.isEmpty() || x3Var.Q, s3Var.S == photoEntry);
            s3Var.S = photoEntry;
            s3Var.g((photoEntry == null || !photoEntry.isVideo || photoEntry.isLivePhoto()) ? null : AndroidUtilities.formatShortDuration(photoEntry.duration));
            s3Var.F = null;
            if (photoEntry == null) {
                s3Var.O = null;
            } else if (photoEntry.isVideo) {
                StringBuilder sb2 = new StringBuilder();
                wl.l(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(photoEntry.duration));
                s3Var.O = sb2.toString();
            } else {
                s3Var.O = LocaleController.getString(R.string.AttachPhoto);
            }
            s3Var.b(photoEntry);
            s3Var.invalidate();
            if (x3Var.M) {
                s3Var.I.setOnClickListener(new bi.x(this, photoEntry, s3Var, 5));
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        x3 x3Var = this.c;
        if (i10 == 0) {
            view = new t3(x3Var, x3Var.getContext());
        } else if (i10 == 1) {
            Context context = x3Var.getContext();
            boolean z10 = x3Var.L;
            bi.g5 g5Var = new bi.g5(context, 1);
            g5Var.setPadding(AndroidUtilities.dp(z10 ? 14.0f : 16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(x3Var.getTitle());
            g5Var.addView(textView, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            x3Var.i0 = g5Var;
            view = g5Var;
        } else {
            view = new s3(x3Var.getContext(), x3Var.b, x3Var.O, x3Var.M);
        }
        return new vk0(view);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        x3 x3Var = this.c;
        ArrayList arrayList = x3Var.h0;
        if (c1Var.f == 2) {
            s3 s3Var = (s3) c1Var.a;
            Object obj = s3Var.S;
            if (!(obj instanceof MediaController.PhotoEntry)) {
                s3Var.f(-1, false, false);
            } else {
                s3Var.f(arrayList.indexOf((MediaController.PhotoEntry) obj), !arrayList.isEmpty() || x3Var.Q, false);
            }
        }
    }
}
