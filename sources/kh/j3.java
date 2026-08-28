package kh;

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
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j3 extends gk0 {
    public final /* synthetic */ q3 c;

    public j3(q3 q3Var) {
        this.c = q3Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.gk0
    public final String F(int i9) {
        MediaController.PhotoEntry photoEntry;
        int i10 = i9 - 2;
        q3 q3Var = this.c;
        if (q3Var.V) {
            if (i10 == 0) {
                return null;
            }
            i10 = i9 - 3;
        } else if (q3Var.W) {
            if (i10 >= 0 && i10 < q3Var.U.size()) {
                return LocaleController.formatYearMont(((a8) q3Var.U.get(i10)).d / 1000, true);
            }
            i10 -= q3Var.U.size();
        }
        ArrayList arrayList = q3Var.b0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) q3Var.b0.get(i10)) == null) {
            return null;
        }
        long j10 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override // org.telegram.ui.Components.gk0
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        int k10 = k();
        float width = (wk0Var.getWidth() - wk0Var.getPaddingLeft()) - wk0Var.getPaddingRight();
        q3 q3Var = this.c;
        a3 a3Var = q3Var.e;
        float f11 = a3Var.J;
        int i9 = (int) (((int) (width / f11)) * q3Var.K);
        int ceil = (int) Math.ceil(k10 / f11);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, r2 - ((AndroidUtilities.displaySize.y - wk0Var.getPaddingTop()) - wk0Var.getPaddingBottom())), f10) / (ceil * i9)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, a3Var.J * round) + 2;
        iArr[1] = wk0Var.getPaddingTop() + ((int) ((lerp - round) * i9));
    }

    @Override // org.telegram.ui.Components.gk0
    public final float H(wk0 wk0Var) {
        int k10 = k();
        float width = (wk0Var.getWidth() - wk0Var.getPaddingLeft()) - wk0Var.getPaddingRight();
        float f10 = this.c.e.J;
        return (Math.max(0, wk0Var.computeVerticalScrollOffset() - r2.getPadding()) - wk0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f10)) * ((int) (((int) (width / f10)) * r2.K))) - (AndroidUtilities.displaySize.y - wk0Var.getPaddingTop()));
    }

    @Override // f2.r0
    public final int h() {
        return k() + 3;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0 || i9 == h() - 1) {
            return 0;
        }
        return i9 == 1 ? 1 : 2;
    }

    @Override // f2.r0
    public final int k() {
        q3 q3Var = this.c;
        ArrayList arrayList = q3Var.b0;
        int size = arrayList == null ? 0 : arrayList.size();
        return q3Var.V ? size + 1 : q3Var.W ? q3Var.U.size() + size : size;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        q3 q3Var = this.c;
        ArrayList arrayList = q3Var.d0;
        ArrayList arrayList2 = q3Var.U;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 0) {
            ((n3) view).a = i9 == 0 ? q3Var.getPadding() : -1;
            return;
        }
        if (i10 == 2) {
            m3 m3Var = (m3) view;
            boolean z10 = i9 == 2;
            boolean z11 = i9 == 4;
            m3Var.Q = z10;
            m3Var.R = z11;
            m3Var.I = new i3(this, m3Var, 0);
            m3Var.J = new i3(this, m3Var, 1);
            int i11 = i9 - 2;
            if (q3Var.V) {
                if (i11 == 0) {
                    m3Var.f(-1, false, false);
                    m3Var.e(arrayList2.size(), (a8) arrayList2.get(0));
                    return;
                }
                i11 = i9 - 3;
            } else if (q3Var.W) {
                if (i11 >= 0 && i11 < arrayList2.size()) {
                    m3Var.f(-1, false, false);
                    m3Var.e(0, (a8) arrayList2.get(i11));
                    return;
                }
                i11 -= arrayList2.size();
            }
            ArrayList arrayList3 = q3Var.b0;
            if (arrayList3 == null || i11 < 0 || i11 >= arrayList3.size()) {
                return;
            }
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) q3Var.b0.get(i11);
            m3Var.f(arrayList.indexOf(photoEntry), !arrayList.isEmpty() || q3Var.M, m3Var.O == photoEntry);
            m3Var.O = photoEntry;
            m3Var.g((photoEntry == null || !photoEntry.isVideo || photoEntry.isLivePhoto()) ? null : AndroidUtilities.formatShortDuration(photoEntry.duration));
            m3Var.B = null;
            if (photoEntry == null) {
                m3Var.K = null;
            } else if (photoEntry.isVideo) {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.j2.k(R.string.AttachVideo, ", ", sb2);
                sb2.append(LocaleController.formatDuration(photoEntry.duration));
                m3Var.K = sb2.toString();
            } else {
                m3Var.K = LocaleController.getString(R.string.AttachPhoto);
            }
            m3Var.b(photoEntry);
            m3Var.invalidate();
            if (q3Var.I) {
                m3Var.E.setOnClickListener(new fg.f(this, photoEntry, m3Var, 14));
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        q3 q3Var = this.c;
        if (i9 == 0) {
            view = new n3(q3Var, q3Var.getContext());
        } else if (i9 == 1) {
            Context context = q3Var.getContext();
            boolean z10 = q3Var.H;
            dh.g gVar = new dh.g(context, 2);
            gVar.setPadding(AndroidUtilities.dp(z10 ? 14.0f : 16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(q3Var.getTitle());
            gVar.addView(textView, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            q3Var.e0 = gVar;
            view = gVar;
        } else {
            view = new m3(q3Var.getContext(), q3Var.b, q3Var.K, q3Var.I);
        }
        return new ik0(view);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        q3 q3Var = this.c;
        ArrayList arrayList = q3Var.d0;
        if (q1Var.f == 2) {
            m3 m3Var = (m3) q1Var.a;
            Object obj = m3Var.O;
            if (!(obj instanceof MediaController.PhotoEntry)) {
                m3Var.f(-1, false, false);
            } else {
                m3Var.f(arrayList.indexOf((MediaController.PhotoEntry) obj), !arrayList.isEmpty() || q3Var.M, false);
            }
        }
    }
}
