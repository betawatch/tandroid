package fi;

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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class h3 extends tl0 {
    public final /* synthetic */ o3 c;

    public h3(o3 o3Var) {
        this.c = o3Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.tl0
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        o3 o3Var = this.c;
        if (o3Var.c0) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (o3Var.d0) {
            if (i11 >= 0 && i11 < o3Var.b0.size()) {
                return LocaleController.formatYearMont(((w7) o3Var.b0.get(i11)).d / 1000, true);
            }
            i11 -= o3Var.b0.size();
        }
        ArrayList arrayList = o3Var.f0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) o3Var.f0.get(i11)) == null) {
            return null;
        }
        long j10 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override // org.telegram.ui.Components.tl0
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        int k10 = k();
        float width = (mm0Var.getWidth() - mm0Var.getPaddingLeft()) - mm0Var.getPaddingRight();
        o3 o3Var = this.c;
        y2 y2Var = o3Var.e;
        float f10 = y2Var.J;
        int i10 = (int) (((int) (width / f10)) * o3Var.O);
        int ceil = (int) Math.ceil(k10 / f10);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, r2 - ((AndroidUtilities.displaySize.y - mm0Var.getPaddingTop()) - mm0Var.getPaddingBottom())), f7) / (ceil * i10)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, y2Var.J * round) + 2;
        iArr[1] = mm0Var.getPaddingTop() + ((int) ((lerp - round) * i10));
    }

    @Override // org.telegram.ui.Components.tl0
    public final float H(mm0 mm0Var) {
        int k10 = k();
        float width = (mm0Var.getWidth() - mm0Var.getPaddingLeft()) - mm0Var.getPaddingRight();
        float f7 = this.c.e.J;
        return (Math.max(0, mm0Var.computeVerticalScrollOffset() - r2.getPadding()) - mm0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f7)) * ((int) (((int) (width / f7)) * r2.O))) - (AndroidUtilities.displaySize.y - mm0Var.getPaddingTop()));
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
        o3 o3Var = this.c;
        ArrayList arrayList = o3Var.f0;
        int size = arrayList == null ? 0 : arrayList.size();
        return o3Var.c0 ? size + 1 : o3Var.d0 ? o3Var.b0.size() + size : size;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        o3 o3Var = this.c;
        ArrayList arrayList = o3Var.h0;
        ArrayList arrayList2 = o3Var.b0;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            ((l3) view).a = i10 == 0 ? o3Var.getPadding() : -1;
            return;
        }
        if (i11 == 2) {
            k3 k3Var = (k3) view;
            boolean z10 = i10 == 2;
            boolean z11 = i10 == 4;
            k3Var.U = z10;
            k3Var.V = z11;
            k3Var.M = new g3(this, k3Var, 0);
            k3Var.N = new g3(this, k3Var, 1);
            int i12 = i10 - 2;
            if (o3Var.c0) {
                if (i12 == 0) {
                    k3Var.f(-1, false, false);
                    k3Var.e(arrayList2.size(), (w7) arrayList2.get(0));
                    return;
                }
                i12 = i10 - 3;
            } else if (o3Var.d0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    k3Var.f(-1, false, false);
                    k3Var.e(0, (w7) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = o3Var.f0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) o3Var.f0.get(i12);
            k3Var.f(arrayList.indexOf(photoEntry), !arrayList.isEmpty() || o3Var.Q, k3Var.S == photoEntry);
            k3Var.S = photoEntry;
            k3Var.g((photoEntry == null || !photoEntry.isVideo || photoEntry.isLivePhoto()) ? null : AndroidUtilities.formatShortDuration(photoEntry.duration));
            k3Var.F = null;
            if (photoEntry == null) {
                k3Var.O = null;
            } else if (photoEntry.isVideo) {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.d3.p(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(photoEntry.duration));
                k3Var.O = sb2.toString();
            } else {
                k3Var.O = LocaleController.getString(R.string.AttachPhoto);
            }
            k3Var.b(photoEntry);
            k3Var.invalidate();
            if (o3Var.M) {
                k3Var.I.setOnClickListener(new bi.w0(this, photoEntry, k3Var, 8));
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        o3 o3Var = this.c;
        if (i10 == 0) {
            view = new l3(o3Var, o3Var.getContext());
        } else if (i10 == 1) {
            Context context = o3Var.getContext();
            boolean z10 = o3Var.L;
            di.i4 i4Var = new di.i4(context, 1);
            i4Var.setPadding(AndroidUtilities.dp(z10 ? 14.0f : 16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(o3Var.getTitle());
            i4Var.addView(textView, gb1.h(-1, -1.0f, 119, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            o3Var.i0 = i4Var;
            view = i4Var;
        } else {
            view = new k3(o3Var.getContext(), o3Var.b, o3Var.O, o3Var.M);
        }
        return new vl0(view);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        o3 o3Var = this.c;
        ArrayList arrayList = o3Var.h0;
        if (e1Var.f == 2) {
            k3 k3Var = (k3) e1Var.a;
            Object obj = k3Var.S;
            if (!(obj instanceof MediaController.PhotoEntry)) {
                k3Var.f(-1, false, false);
            } else {
                k3Var.f(arrayList.indexOf((MediaController.PhotoEntry) obj), !arrayList.isEmpty() || o3Var.Q, false);
            }
        }
    }
}
