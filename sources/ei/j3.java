package ei;

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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class j3 extends ul0 {
    public final /* synthetic */ q3 c;

    public j3(q3 q3Var) {
        this.c = q3Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.ul0
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        q3 q3Var = this.c;
        if (q3Var.c0) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (q3Var.d0) {
            if (i11 >= 0 && i11 < q3Var.b0.size()) {
                return LocaleController.formatYearMont(((a8) q3Var.b0.get(i11)).d / 1000, true);
            }
            i11 -= q3Var.b0.size();
        }
        ArrayList arrayList = q3Var.f0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) q3Var.f0.get(i11)) == null) {
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
        q3 q3Var = this.c;
        a3 a3Var = q3Var.e;
        float f10 = a3Var.J;
        int i10 = (int) (((int) (width / f10)) * q3Var.O);
        int ceil = (int) Math.ceil(k10 / f10);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, r2 - ((AndroidUtilities.displaySize.y - mm0Var.getPaddingTop()) - mm0Var.getPaddingBottom())), f7) / (ceil * i10)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, a3Var.J * round) + 2;
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
        q3 q3Var = this.c;
        ArrayList arrayList = q3Var.f0;
        int size = arrayList == null ? 0 : arrayList.size();
        return q3Var.c0 ? size + 1 : q3Var.d0 ? q3Var.b0.size() + size : size;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        q3 q3Var = this.c;
        ArrayList arrayList = q3Var.h0;
        ArrayList arrayList2 = q3Var.b0;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            ((n3) view).a = i10 == 0 ? q3Var.getPadding() : -1;
            return;
        }
        if (i11 == 2) {
            m3 m3Var = (m3) view;
            boolean z10 = i10 == 2;
            boolean z11 = i10 == 4;
            m3Var.U = z10;
            m3Var.V = z11;
            m3Var.M = new i3(this, m3Var, 0);
            m3Var.N = new i3(this, m3Var, 1);
            int i12 = i10 - 2;
            if (q3Var.c0) {
                if (i12 == 0) {
                    m3Var.f(-1, false, false);
                    m3Var.e(arrayList2.size(), (a8) arrayList2.get(0));
                    return;
                }
                i12 = i10 - 3;
            } else if (q3Var.d0) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    m3Var.f(-1, false, false);
                    m3Var.e(0, (a8) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = q3Var.f0;
            if (arrayList3 == null || i12 < 0 || i12 >= arrayList3.size()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) q3Var.f0.get(i12);
            m3Var.f(arrayList.indexOf(photoEntry), !arrayList.isEmpty() || q3Var.Q, m3Var.S == photoEntry);
            m3Var.S = photoEntry;
            m3Var.g((photoEntry == null || !photoEntry.isVideo || photoEntry.isLivePhoto()) ? null : AndroidUtilities.formatShortDuration(photoEntry.duration));
            m3Var.F = null;
            if (photoEntry == null) {
                m3Var.O = null;
            } else if (photoEntry.isVideo) {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.b1.o(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(photoEntry.duration));
                m3Var.O = sb2.toString();
            } else {
                m3Var.O = LocaleController.getString(R.string.AttachPhoto);
            }
            m3Var.b(photoEntry);
            m3Var.invalidate();
            if (q3Var.M) {
                m3Var.I.setOnClickListener(new ai.v0(this, photoEntry, m3Var, 8));
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        q3 q3Var = this.c;
        if (i10 == 0) {
            view = new n3(q3Var, q3Var.getContext());
        } else if (i10 == 1) {
            Context context = q3Var.getContext();
            boolean z10 = q3Var.L;
            ci.h4 h4Var = new ci.h4(context, 1);
            h4Var.setPadding(AndroidUtilities.dp(z10 ? 14.0f : 16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(q3Var.getTitle());
            h4Var.addView(textView, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            q3Var.i0 = h4Var;
            view = h4Var;
        } else {
            view = new m3(q3Var.getContext(), q3Var.b, q3Var.O, q3Var.M);
        }
        return new wl0(view);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        q3 q3Var = this.c;
        ArrayList arrayList = q3Var.h0;
        if (b1Var.f == 2) {
            m3 m3Var = (m3) b1Var.a;
            Object obj = m3Var.S;
            if (!(obj instanceof MediaController.PhotoEntry)) {
                m3Var.f(-1, false, false);
            } else {
                m3Var.f(arrayList.indexOf((MediaController.PhotoEntry) obj), !arrayList.isEmpty() || q3Var.Q, false);
            }
        }
    }
}
