package nh;

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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g3 extends tk0 {
    public final /* synthetic */ n3 c;

    public g3(n3 n3Var) {
        this.c = n3Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        n3 n3Var = this.c;
        if (n3Var.V) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (n3Var.W) {
            if (i11 >= 0 && i11 < n3Var.U.size()) {
                return LocaleController.formatYearMont(((o7) n3Var.U.get(i11)).d / 1000, true);
            }
            i11 -= n3Var.U.size();
        }
        ArrayList arrayList = n3Var.b0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) n3Var.b0.get(i11)) == null) {
            return null;
        }
        long j10 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        int k9 = k();
        float width = (jl0Var.getWidth() - jl0Var.getPaddingLeft()) - jl0Var.getPaddingRight();
        n3 n3Var = this.c;
        x2 x2Var = n3Var.e;
        float f10 = x2Var.J;
        int i10 = (int) (((int) (width / f10)) * n3Var.K);
        int ceil = (int) Math.ceil(k9 / f10);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, r2 - ((AndroidUtilities.displaySize.y - jl0Var.getPaddingTop()) - jl0Var.getPaddingBottom())), f9) / (ceil * i10)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, x2Var.J * round) + 2;
        iArr[1] = jl0Var.getPaddingTop() + ((int) ((lerp - round) * i10));
    }

    @Override // org.telegram.ui.Components.tk0
    public final float H(jl0 jl0Var) {
        int k9 = k();
        float width = (jl0Var.getWidth() - jl0Var.getPaddingLeft()) - jl0Var.getPaddingRight();
        float f9 = this.c.e.J;
        return (Math.max(0, jl0Var.computeVerticalScrollOffset() - r2.getPadding()) - jl0Var.getPaddingTop()) / ((((int) Math.ceil(k9 / f9)) * ((int) (((int) (width / f9)) * r2.K))) - (AndroidUtilities.displaySize.y - jl0Var.getPaddingTop()));
    }

    @Override // f2.p0
    public final int h() {
        return k() + 3;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0 || i10 == h() - 1) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    @Override // f2.p0
    public final int k() {
        n3 n3Var = this.c;
        ArrayList arrayList = n3Var.b0;
        int size = arrayList == null ? 0 : arrayList.size();
        return n3Var.V ? size + 1 : n3Var.W ? n3Var.U.size() + size : size;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        n3 n3Var = this.c;
        ArrayList arrayList = n3Var.d0;
        ArrayList arrayList2 = n3Var.U;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 == 0) {
            ((k3) view).a = i10 == 0 ? n3Var.getPadding() : -1;
            return;
        }
        if (i11 == 2) {
            j3 j3Var = (j3) view;
            boolean z10 = i10 == 2;
            boolean z11 = i10 == 4;
            j3Var.Q = z10;
            j3Var.R = z11;
            j3Var.I = new f3(this, j3Var, 0);
            j3Var.J = new f3(this, j3Var, 1);
            int i12 = i10 - 2;
            if (n3Var.V) {
                if (i12 == 0) {
                    j3Var.f(-1, false, false);
                    j3Var.e(arrayList2.size(), (o7) arrayList2.get(0));
                    return;
                }
                i12 = i10 - 3;
            } else if (n3Var.W) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    j3Var.f(-1, false, false);
                    j3Var.e(0, (o7) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = n3Var.b0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) n3Var.b0.get(i12);
            j3Var.f(arrayList.indexOf(photoEntry), !arrayList.isEmpty() || n3Var.M, j3Var.O == photoEntry);
            j3Var.O = photoEntry;
            j3Var.g((photoEntry == null || !photoEntry.isVideo || photoEntry.isLivePhoto()) ? null : AndroidUtilities.formatShortDuration(photoEntry.duration));
            j3Var.B = null;
            if (photoEntry == null) {
                j3Var.K = null;
            } else if (photoEntry.isVideo) {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.b.j(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(photoEntry.duration));
                j3Var.K = sb2.toString();
            } else {
                j3Var.K = LocaleController.getString(R.string.AttachPhoto);
            }
            j3Var.b(photoEntry);
            j3Var.invalidate();
            if (n3Var.I) {
                j3Var.E.setOnClickListener(new bg.q(this, photoEntry, j3Var, 15));
            }
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        n3 n3Var = this.c;
        if (i10 == 0) {
            view = new k3(n3Var, n3Var.getContext());
        } else if (i10 == 1) {
            Context context = n3Var.getContext();
            boolean z10 = n3Var.H;
            bh.d dVar = new bh.d(context, 5);
            dVar.setPadding(AndroidUtilities.dp(z10 ? 14.0f : 16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(n3Var.getTitle());
            dVar.addView(textView, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            n3Var.e0 = dVar;
            view = dVar;
        } else {
            view = new j3(n3Var.getContext(), n3Var.b, n3Var.K, n3Var.I);
        }
        return new vk0(view);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        n3 n3Var = this.c;
        ArrayList arrayList = n3Var.d0;
        if (n1Var.f == 2) {
            j3 j3Var = (j3) n1Var.a;
            Object obj = j3Var.O;
            if (!(obj instanceof MediaController.PhotoEntry)) {
                j3Var.f(-1, false, false);
            } else {
                j3Var.f(arrayList.indexOf((MediaController.PhotoEntry) obj), !arrayList.isEmpty() || n3Var.M, false);
            }
        }
    }
}
