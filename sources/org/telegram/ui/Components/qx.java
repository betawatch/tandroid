package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class qx extends bk0 {
    public boolean E;
    public boolean F;
    public final /* synthetic */ ry G;
    public final mx c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String w;
    public String x;
    public px y;

    public qx(ry ryVar, Context context) {
        this.G = ryVar;
        mx mxVar = new mx(context, ryVar.d1, new d(this, 12), new b0(this, 29), ryVar.a2);
        this.c = mxVar;
        mxVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        mxVar.setClipToPadding(false);
        mxVar.g3.r = false;
        mxVar.setNestedScrollingEnabled(false);
        mxVar.setDrawSelection(false);
        mxVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(qx qxVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        ry ryVar = qxVar.G;
        String[] strArr = ryVar.X0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = qxVar.w;
        if (str2 == null) {
            return;
        }
        org.telegram.messenger.ri.d0(ryVar.d1).e2(true, str, str2, new bi.i2(qxVar, str2, arrayList, runnable, 10), z10);
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 0 || i7 == 4;
    }

    public final void F(String str, boolean z10) {
        ry ryVar = this.G;
        ex exVar = ryVar.Q;
        if (TextUtils.isEmpty(str)) {
            this.w = null;
            v4.i0 adapter = exVar.getAdapter();
            bx bxVar = ryVar.S;
            if (adapter != bxVar) {
                exVar.setAdapter(bxVar);
                this.E = false;
            }
            this.d = 0L;
            ryVar.b.a(false, true);
            f();
        } else {
            this.w = str.toLowerCase();
        }
        px pxVar = this.y;
        if (pxVar != null) {
            org.telegram.messenger.g0.r(pxVar);
        }
        if (TextUtils.isEmpty(this.w)) {
            return;
        }
        this.n.clear();
        this.F = false;
        ryVar.W.e(true);
        px pxVar2 = new px(this);
        this.y = pxVar2;
        org.telegram.messenger.g0.h3(pxVar2, z10 ? 300L : 0L);
    }

    @Override // v4.i0
    public final int b() {
        if (this.d != 0) {
            return this.f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.s;
        ArrayList arrayList3 = this.r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.E) {
            return this.G.getRecentEmoji().size() + 1;
        }
        int i7 = 2;
        if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
            return 2;
        }
        if (!arrayList2.isEmpty()) {
            i7 = 3;
        } else if (arrayList.isEmpty()) {
            i7 = 1;
        }
        int size = arrayList.size() + i7;
        if (arrayList3.isEmpty()) {
            return size;
        }
        return arrayList3.size() + size + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
    
        if (r8 == 2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0052, code lost:
    
        if (r8 == 1) goto L49;
     */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i7) {
        int i10 = 2;
        if (this.d != 0) {
            if (i7 != 0) {
                if (i7 == 1) {
                    return 4;
                }
                if (i7 != 2) {
                    return i7 == b() - 1 ? 5 : 0;
                }
                return 3;
            }
            return 1;
        }
        if (i7 != 0) {
            ArrayList arrayList = this.s;
            ArrayList arrayList2 = this.r;
            ArrayList arrayList3 = this.h;
            if (i7 == 1 && this.E && arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                return 2;
            }
            if (arrayList.isEmpty()) {
                if (!arrayList3.isEmpty()) {
                }
                if (arrayList2.isEmpty()) {
                    return 0;
                }
                if (!arrayList.isEmpty()) {
                    i10 = 3;
                } else if (arrayList3.isEmpty()) {
                    i10 = 1;
                }
                if (i7 != arrayList3.size() + i10) {
                    return 0;
                }
            } else if (i7 == 1) {
                return 4;
            }
            return 3;
        }
        return 1;
    }

    @Override // v4.i0
    public final void f() {
        this.c.g3.O(false);
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        String str;
        String str2;
        TLRPC.Document document;
        String str3;
        String str4;
        Long l10;
        int i10 = f1Var.f;
        View view = f1Var.a;
        ArrayList arrayList = this.s;
        boolean z10 = true;
        int i11 = 1;
        ArrayList arrayList2 = this.h;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            }
            org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
            if (this.d != 0) {
                k8Var.a(0, org.telegram.messenger.gd.G(this.f.size(), "EmojiCount", new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i11 = 3;
            } else if (!arrayList2.isEmpty()) {
                i11 = 2;
            }
            if (i7 == arrayList2.size() + i11) {
                k8Var.a(0, org.telegram.messenger.gd.M0(2131744640, null));
                return;
            } else {
                k8Var.a(0, org.telegram.messenger.gd.M0(2131744639, null));
                return;
            }
        }
        zx zxVar = (zx) view;
        zxVar.a = i7;
        zxVar.e = null;
        int i12 = i7 - 1;
        if (!arrayList.isEmpty() || this.d != 0) {
            i12 = i7 - 3;
        } else if (!arrayList2.isEmpty()) {
            i12 = i7 - 2;
        }
        if (this.d != 0) {
            document = (TLRPC.Document) this.f.get(i12);
            z10 = false;
            str = null;
            str2 = null;
        } else {
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.r;
            if (isEmpty && arrayList3.isEmpty() && !this.E) {
                str = this.G.getRecentEmoji().get(i12);
                str2 = str;
            } else {
                str = i12 < arrayList2.size() ? ((org.telegram.messenger.ni) arrayList2.get(i12)).a : ((org.telegram.messenger.ni) arrayList3.get((i12 - arrayList2.size()) - 1)).a;
                str2 = str;
                z10 = false;
            }
            document = null;
        }
        if (str != null && str.startsWith("animated_")) {
            try {
                l10 = Long.valueOf(Long.parseLong(str.substring(9)));
                str4 = null;
                str3 = null;
            } catch (Exception unused) {
            }
            if (document == null || l10 != null) {
                zxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
            } else {
                zxVar.setPadding(0, 0, 0, 0);
            }
            if (document == null) {
                zxVar.a(null, z10);
                if (zxVar.getSpan() == null || zxVar.getSpan().document != document) {
                    zxVar.setSpan(new x5(document, (Paint.FontMetricsInt) null));
                }
            } else if (l10 != null) {
                zxVar.a(null, z10);
                if (zxVar.getSpan() == null || zxVar.getSpan().getDocumentId() != l10.longValue()) {
                    zxVar.setSpan(new x5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            } else if (str3 != null) {
                zxVar.a(org.telegram.messenger.j6.f(str3), z10);
                zxVar.setSpan(null);
            } else {
                zxVar.a(null, z10);
                zxVar.setSpan(null);
            }
            zxVar.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l10 = null;
        if (document == null) {
        }
        zxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        if (document == null) {
        }
        zxVar.setTag(str4);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        ry ryVar = this.G;
        org.telegram.ui.ActionBar.i6 i6Var = ryVar.a2;
        if (i7 == 0) {
            view = new zx(ryVar.getContext());
        } else if (i7 == 1) {
            View view2 = new View(ryVar.getContext());
            view2.setLayoutParams(new v4.q0(-1, ryVar.c1));
            view = view2;
        } else if (i7 == 3) {
            view = new org.telegram.ui.Cells.k8(ryVar.getContext(), true, false, ryVar.a2, ryVar.j2);
        } else if (i7 == 4) {
            ViewGroup.LayoutParams q0Var = new v4.q0(-1, org.telegram.messenger.g0.L(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(q0Var);
            view = view3;
        } else if (i7 != 5) {
            bi.a3 a3Var = new bi.a3(19, ryVar.getContext(), this);
            TextView textView = new TextView(ryVar.getContext());
            org.telegram.messenger.n10.l(16.0f, 2131748021, 1, textView, null);
            int i10 = org.telegram.ui.ActionBar.n6.Df;
            org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
            a3Var.addView(textView, c8.ma.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(ryVar.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.MULTIPLY);
            a3Var.addView(imageView, c8.ma.e(48, 48, 85));
            imageView.setOnClickListener(new androidx.mediarouter.app.w(this, 10));
            a3Var.setLayoutParams(new v4.q0(-1, -2));
            view = a3Var;
        } else {
            View view4 = new View(ryVar.getContext());
            view4.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(68.0f)));
            view = view4;
        }
        return new kj0(view);
    }
}
