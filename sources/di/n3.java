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
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class n3 extends ul0 {
    public final /* synthetic */ v3 c;

    public n3(v3 v3Var) {
        this.c = v3Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.ul0
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        v3 v3Var = this.c;
        if (v3Var.c0) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (v3Var.d0) {
            if (i11 >= 0 && i11 < v3Var.b0.size()) {
                return LocaleController.formatYearMont(((k8) v3Var.b0.get(i11)).d / 1000, true);
            }
            i11 -= v3Var.b0.size();
        }
        ArrayList arrayList = v3Var.f0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) v3Var.f0.get(i11)) == null) {
            return null;
        }
        long j10 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override // org.telegram.ui.Components.ul0
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        int k10 = k();
        float width = (mm0Var.getWidth() - mm0Var.getPaddingLeft()) - mm0Var.getPaddingRight();
        v3 v3Var = this.c;
        e3 e3Var = v3Var.e;
        float f10 = e3Var.J;
        int i10 = (int) (((int) (width / f10)) * v3Var.O);
        int ceil = (int) Math.ceil(k10 / f10);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, r2 - ((AndroidUtilities.displaySize.y - mm0Var.getPaddingTop()) - mm0Var.getPaddingBottom())), f7) / (ceil * i10)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, e3Var.J * round) + 2;
        iArr[1] = mm0Var.getPaddingTop() + ((int) ((lerp - round) * i10));
    }

    @Override // org.telegram.ui.Components.ul0
    public final float H(mm0 mm0Var) {
        int k10 = k();
        float width = (mm0Var.getWidth() - mm0Var.getPaddingLeft()) - mm0Var.getPaddingRight();
        float f7 = this.c.e.J;
        return (Math.max(0, mm0Var.computeVerticalScrollOffset() - r2.getPadding()) - mm0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f7)) * ((int) (((int) (width / f7)) * r2.O))) - (AndroidUtilities.displaySize.y - mm0Var.getPaddingTop()));
    }

    @Override // s4.g0
    public final int h() {
        return k() + 3;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0 || i10 == h() - 1) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    @Override // s4.g0
    public final int k() {
        v3 v3Var = this.c;
        ArrayList arrayList = v3Var.f0;
        int size = arrayList == null ? 0 : arrayList.size();
        return v3Var.c0 ? size + 1 : v3Var.d0 ? v3Var.b0.size() + size : size;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        v3 v3Var = this.c;
        ArrayList arrayList = v3Var.h0;
        ArrayList arrayList2 = v3Var.b0;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            ((r3) view).a = i10 == 0 ? v3Var.getPadding() : -1;
            return;
        }
        if (i11 == 2) {
            q3 q3Var = (q3) view;
            boolean z10 = i10 == 2;
            boolean z11 = i10 == 4;
            q3Var.U = z10;
            q3Var.V = z11;
            q3Var.M = new m3(this, q3Var, 0);
            q3Var.N = new m3(this, q3Var, 1);
            int i12 = i10 - 2;
            if (v3Var.c0) {
                if (i12 == 0) {
                    q3Var.f(-1, false, false);
                    q3Var.e(arrayList2.size(), (k8) arrayList2.get(0));
                    return;
                }
                i12 = i10 - 3;
            } else if (v3Var.d0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    q3Var.f(-1, false, false);
                    q3Var.e(0, (k8) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = v3Var.f0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) v3Var.f0.get(i12);
            q3Var.f(arrayList.indexOf(photoEntry), !arrayList.isEmpty() || v3Var.Q, q3Var.S == photoEntry);
            q3Var.S = photoEntry;
            q3Var.g((photoEntry == null || !photoEntry.isVideo || photoEntry.isLivePhoto()) ? null : AndroidUtilities.formatShortDuration(photoEntry.duration));
            q3Var.F = null;
            if (photoEntry == null) {
                q3Var.O = null;
            } else if (photoEntry.isVideo) {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c1.l(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(photoEntry.duration));
                q3Var.O = sb2.toString();
            } else {
                q3Var.O = LocaleController.getString(R.string.AttachPhoto);
            }
            q3Var.b(photoEntry);
            q3Var.invalidate();
            if (v3Var.M) {
                q3Var.I.setOnClickListener(new bi.x(this, photoEntry, q3Var, 5));
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        v3 v3Var = this.c;
        if (i10 == 0) {
            view = new r3(v3Var, v3Var.getContext());
        } else if (i10 == 1) {
            Context context = v3Var.getContext();
            boolean z10 = v3Var.L;
            bi.i5 i5Var = new bi.i5(context, 1);
            i5Var.setPadding(AndroidUtilities.dp(z10 ? 14.0f : 16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(v3Var.getTitle());
            i5Var.addView(textView, w7.z5.a(-1.0f, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f, -1, 119));
            v3Var.i0 = i5Var;
            view = i5Var;
        } else {
            view = new q3(v3Var.getContext(), v3Var.b, v3Var.O, v3Var.M);
        }
        return new wl0(view);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        v3 v3Var = this.c;
        ArrayList arrayList = v3Var.h0;
        if (b1Var.f == 2) {
            q3 q3Var = (q3) b1Var.a;
            Object obj = q3Var.S;
            if (!(obj instanceof MediaController.PhotoEntry)) {
                q3Var.f(-1, false, false);
            } else {
                q3Var.f(arrayList.indexOf((MediaController.PhotoEntry) obj), !arrayList.isEmpty() || v3Var.Q, false);
            }
        }
    }
}
