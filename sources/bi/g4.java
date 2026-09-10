package bi;

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
import org.telegram.messenger.em;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class g4 extends dl0 {
    public final /* synthetic */ p4 c;

    public g4(p4 p4Var) {
        this.c = p4Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.dl0
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        p4 p4Var = this.c;
        if (p4Var.c0) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (p4Var.d0) {
            if (i11 >= 0 && i11 < p4Var.b0.size()) {
                return LocaleController.formatYearMont(((r9) p4Var.b0.get(i11)).d / 1000, true);
            }
            i11 -= p4Var.b0.size();
        }
        ArrayList arrayList = p4Var.f0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) p4Var.f0.get(i11)) == null) {
            return null;
        }
        long j3 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j3 /= 1000;
        }
        return LocaleController.formatYearMont(j3, true);
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        int k10 = k();
        float width = (vl0Var.getWidth() - vl0Var.getPaddingLeft()) - vl0Var.getPaddingRight();
        p4 p4Var = this.c;
        x3 x3Var = p4Var.e;
        float f10 = x3Var.J;
        int i10 = (int) (((int) (width / f10)) * p4Var.O);
        int ceil = (int) Math.ceil(k10 / f10);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, r2 - ((AndroidUtilities.displaySize.y - vl0Var.getPaddingTop()) - vl0Var.getPaddingBottom())), f7) / (ceil * i10)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, x3Var.J * round) + 2;
        iArr[1] = vl0Var.getPaddingTop() + ((int) ((lerp - round) * i10));
    }

    @Override // org.telegram.ui.Components.dl0
    public final float H(vl0 vl0Var) {
        int k10 = k();
        float width = (vl0Var.getWidth() - vl0Var.getPaddingLeft()) - vl0Var.getPaddingRight();
        float f7 = this.c.e.J;
        return (Math.max(0, vl0Var.computeVerticalScrollOffset() - r2.getPadding()) - vl0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f7)) * ((int) (((int) (width / f7)) * r2.O))) - (AndroidUtilities.displaySize.y - vl0Var.getPaddingTop()));
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
        p4 p4Var = this.c;
        ArrayList arrayList = p4Var.f0;
        int size = arrayList == null ? 0 : arrayList.size();
        return p4Var.c0 ? size + 1 : p4Var.d0 ? p4Var.b0.size() + size : size;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        p4 p4Var = this.c;
        ArrayList arrayList = p4Var.h0;
        ArrayList arrayList2 = p4Var.b0;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            ((k4) view).a = i10 == 0 ? p4Var.getPadding() : -1;
            return;
        }
        if (i11 == 2) {
            j4 j4Var = (j4) view;
            boolean z10 = i10 == 2;
            boolean z11 = i10 == 4;
            j4Var.U = z10;
            j4Var.V = z11;
            j4Var.M = new f4(this, j4Var, 0);
            j4Var.N = new f4(this, j4Var, 1);
            int i12 = i10 - 2;
            if (p4Var.c0) {
                if (i12 == 0) {
                    j4Var.f(-1, false, false);
                    j4Var.e(arrayList2.size(), (r9) arrayList2.get(0));
                    return;
                }
                i12 = i10 - 3;
            } else if (p4Var.d0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    j4Var.f(-1, false, false);
                    j4Var.e(0, (r9) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = p4Var.f0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) p4Var.f0.get(i12);
            j4Var.f(arrayList.indexOf(photoEntry), !arrayList.isEmpty() || p4Var.Q, j4Var.S == photoEntry);
            j4Var.S = photoEntry;
            j4Var.g((photoEntry == null || !photoEntry.isVideo || photoEntry.isLivePhoto()) ? null : AndroidUtilities.formatShortDuration(photoEntry.duration));
            j4Var.F = null;
            if (photoEntry == null) {
                j4Var.O = null;
            } else if (photoEntry.isVideo) {
                StringBuilder sb2 = new StringBuilder();
                em.l(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(photoEntry.duration));
                j4Var.O = sb2.toString();
            } else {
                j4Var.O = LocaleController.getString(R.string.AttachPhoto);
            }
            j4Var.b(photoEntry);
            j4Var.invalidate();
            if (p4Var.M) {
                j4Var.I.setOnClickListener(new q(this, photoEntry, j4Var, 1));
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        p4 p4Var = this.c;
        if (i10 == 0) {
            view = new k4(p4Var, p4Var.getContext());
        } else if (i10 == 1) {
            Context context = p4Var.getContext();
            boolean z10 = p4Var.L;
            l4 l4Var = new l4(context, 0);
            l4Var.setPadding(AndroidUtilities.dp(z10 ? 14.0f : 16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(p4Var.getTitle());
            l4Var.addView(textView, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            p4Var.i0 = l4Var;
            view = l4Var;
        } else {
            view = new j4(p4Var.getContext(), p4Var.b, p4Var.O, p4Var.M);
        }
        return new fl0(view);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        p4 p4Var = this.c;
        ArrayList arrayList = p4Var.h0;
        if (c1Var.f == 2) {
            j4 j4Var = (j4) c1Var.a;
            Object obj = j4Var.S;
            if (!(obj instanceof MediaController.PhotoEntry)) {
                j4Var.f(-1, false, false);
            } else {
                j4Var.f(arrayList.indexOf((MediaController.PhotoEntry) obj), !arrayList.isEmpty() || p4Var.Q, false);
            }
        }
    }
}
