package ci;

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
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class o3 extends el0 {
    public final /* synthetic */ w3 c;

    public o3(w3 w3Var) {
        this.c = w3Var;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.el0
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        w3 w3Var = this.c;
        if (w3Var.c0) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (w3Var.d0) {
            if (i11 >= 0 && i11 < w3Var.b0.size()) {
                return LocaleController.formatYearMont(((l8) w3Var.b0.get(i11)).d / 1000, true);
            }
            i11 -= w3Var.b0.size();
        }
        ArrayList arrayList = w3Var.f0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) w3Var.f0.get(i11)) == null) {
            return null;
        }
        long j3 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return LocaleController.formatYearMont(j3, true);
    }

    @Override // org.telegram.ui.Components.el0
    public final void G(wl0 wl0Var, float f7, int[] iArr) {
        int k10 = k();
        float width = (wl0Var.getWidth() - wl0Var.getPaddingLeft()) - wl0Var.getPaddingRight();
        w3 w3Var = this.c;
        f3 f3Var = w3Var.e;
        float f10 = f3Var.J;
        int i10 = (int) (((int) (width / f10)) * w3Var.O);
        int ceil = (int) Math.ceil(k10 / f10);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, r2 - ((AndroidUtilities.displaySize.y - wl0Var.getPaddingTop()) - wl0Var.getPaddingBottom())), f7) / (ceil * i10)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, f3Var.J * round) + 2;
        iArr[1] = wl0Var.getPaddingTop() + ((int) ((lerp - round) * i10));
    }

    @Override // org.telegram.ui.Components.el0
    public final float H(wl0 wl0Var) {
        int k10 = k();
        float width = (wl0Var.getWidth() - wl0Var.getPaddingLeft()) - wl0Var.getPaddingRight();
        float f7 = this.c.e.J;
        return (Math.max(0, wl0Var.computeVerticalScrollOffset() - r2.getPadding()) - wl0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f7)) * ((int) (((int) (width / f7)) * r2.O))) - (AndroidUtilities.displaySize.y - wl0Var.getPaddingTop()));
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
        w3 w3Var = this.c;
        ArrayList arrayList = w3Var.f0;
        int size = arrayList == null ? 0 : arrayList.size();
        return w3Var.c0 ? size + 1 : w3Var.d0 ? w3Var.b0.size() + size : size;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        w3 w3Var = this.c;
        ArrayList arrayList = w3Var.h0;
        ArrayList arrayList2 = w3Var.b0;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            ((s3) view).a = i10 == 0 ? w3Var.getPadding() : -1;
            return;
        }
        if (i11 == 2) {
            r3 r3Var = (r3) view;
            boolean z10 = i10 == 2;
            boolean z11 = i10 == 4;
            r3Var.U = z10;
            r3Var.V = z11;
            r3Var.M = new n3(this, r3Var, 0);
            r3Var.N = new n3(this, r3Var, 1);
            int i12 = i10 - 2;
            if (w3Var.c0) {
                if (i12 == 0) {
                    r3Var.f(-1, false, false);
                    r3Var.e(arrayList2.size(), (l8) arrayList2.get(0));
                    return;
                }
                i12 = i10 - 3;
            } else if (w3Var.d0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    r3Var.f(-1, false, false);
                    r3Var.e(0, (l8) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = w3Var.f0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) w3Var.f0.get(i12);
            r3Var.f(arrayList.indexOf(photoEntry), !arrayList.isEmpty() || w3Var.Q, r3Var.S == photoEntry);
            r3Var.S = photoEntry;
            r3Var.g((photoEntry == null || !photoEntry.isVideo || photoEntry.isLivePhoto()) ? null : AndroidUtilities.formatShortDuration(photoEntry.duration));
            r3Var.F = null;
            if (photoEntry == null) {
                r3Var.O = null;
            } else if (photoEntry.isVideo) {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.n(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(photoEntry.duration));
                r3Var.O = sb2.toString();
            } else {
                r3Var.O = LocaleController.getString(R.string.AttachPhoto);
            }
            r3Var.b(photoEntry);
            r3Var.invalidate();
            if (w3Var.M) {
                r3Var.I.setOnClickListener(new ai.d0(this, photoEntry, r3Var, 5));
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        w3 w3Var = this.c;
        if (i10 == 0) {
            view = new s3(w3Var, w3Var.getContext());
        } else if (i10 == 1) {
            Context context = w3Var.getContext();
            boolean z10 = w3Var.L;
            ai.w5 w5Var = new ai.w5(context, 1);
            w5Var.setPadding(AndroidUtilities.dp(z10 ? 14.0f : 16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(w3Var.getTitle());
            w5Var.addView(textView, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            w3Var.i0 = w5Var;
            view = w5Var;
        } else {
            view = new r3(w3Var.getContext(), w3Var.b, w3Var.O, w3Var.M);
        }
        return new gl0(view);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        w3 w3Var = this.c;
        ArrayList arrayList = w3Var.h0;
        if (c1Var.f == 2) {
            r3 r3Var = (r3) c1Var.a;
            Object obj = r3Var.S;
            if (!(obj instanceof MediaController.PhotoEntry)) {
                r3Var.f(-1, false, false);
            } else {
                r3Var.f(arrayList.indexOf((MediaController.PhotoEntry) obj), !arrayList.isEmpty() || w3Var.Q, false);
            }
        }
    }
}
