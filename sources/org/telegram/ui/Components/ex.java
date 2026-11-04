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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ex extends sj0 {
    public boolean E;
    public boolean F;
    public final /* synthetic */ ey G;
    public final ax c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String w;
    public String x;
    public dx y;

    public ex(ey eyVar, Context context) {
        this.G = eyVar;
        ax axVar = new ax(context, eyVar.d1, new e(this, 11), new zw(this, 0), eyVar.a2);
        this.c = axVar;
        axVar.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(5.0f));
        axVar.setClipToPadding(false);
        axVar.g3.r = false;
        axVar.setNestedScrollingEnabled(false);
        axVar.setDrawSelection(false);
        axVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(ex exVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        ey eyVar = exVar.G;
        String[] strArr = eyVar.X0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = exVar.w;
        if (str2 == null) {
            return;
        }
        org.telegram.messenger.li.b0(eyVar.d1).Z1(true, str, str2, new ai.v1(exVar, str2, arrayList, runnable, 10), z10);
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 0 || i3 == 4;
    }

    public final void F(String str, boolean z10) {
        ey eyVar = this.G;
        rw rwVar = eyVar.Q;
        if (TextUtils.isEmpty(str)) {
            this.w = null;
            u4.h0 adapter = rwVar.getAdapter();
            ow owVar = eyVar.S;
            if (adapter != owVar) {
                rwVar.setAdapter(owVar);
                this.E = false;
            }
            this.d = 0L;
            eyVar.b.a(false, true);
            f();
        } else {
            this.w = str.toLowerCase();
        }
        dx dxVar = this.y;
        if (dxVar != null) {
            org.telegram.messenger.g0.r(dxVar);
        }
        if (TextUtils.isEmpty(this.w)) {
            return;
        }
        this.n.clear();
        this.F = false;
        eyVar.W.e(true);
        dx dxVar2 = new dx(this);
        this.y = dxVar2;
        org.telegram.messenger.g0.i3(dxVar2, z10 ? 300L : 0L);
    }

    @Override // u4.h0
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
        int i3 = 2;
        if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
            return 2;
        }
        if (!arrayList2.isEmpty()) {
            i3 = 3;
        } else if (arrayList.isEmpty()) {
            i3 = 1;
        }
        int size = arrayList.size() + i3;
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
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i3) {
        int i10 = 2;
        if (this.d != 0) {
            if (i3 != 0) {
                if (i3 == 1) {
                    return 4;
                }
                if (i3 != 2) {
                    return i3 == b() - 1 ? 5 : 0;
                }
                return 3;
            }
            return 1;
        }
        if (i3 != 0) {
            ArrayList arrayList = this.s;
            ArrayList arrayList2 = this.r;
            ArrayList arrayList3 = this.h;
            if (i3 == 1 && this.E && arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
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
                if (i3 != arrayList3.size() + i10) {
                    return 0;
                }
            } else if (i3 == 1) {
                return 4;
            }
            return 3;
        }
        return 1;
    }

    @Override // u4.h0
    public final void f() {
        this.c.g3.O(false);
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        String str;
        String str2;
        TLRPC.Document document;
        String str3;
        String str4;
        Long l10;
        int i10 = d1Var.f;
        View view = d1Var.a;
        ArrayList arrayList = this.s;
        boolean z10 = true;
        int i11 = 1;
        ArrayList arrayList2 = this.h;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            }
            org.telegram.ui.Cells.i8 i8Var = (org.telegram.ui.Cells.i8) view;
            if (this.d != 0) {
                i8Var.a(0, org.telegram.messenger.bd.G(this.f.size(), "EmojiCount", new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i11 = 3;
            } else if (!arrayList2.isEmpty()) {
                i11 = 2;
            }
            if (i3 == arrayList2.size() + i11) {
                i8Var.a(0, org.telegram.messenger.bd.M0(2131744885, null));
                return;
            } else {
                i8Var.a(0, org.telegram.messenger.bd.M0(2131744884, null));
                return;
            }
        }
        nx nxVar = (nx) view;
        nxVar.a = i3;
        nxVar.e = null;
        int i12 = i3 - 1;
        if (!arrayList.isEmpty() || this.d != 0) {
            i12 = i3 - 3;
        } else if (!arrayList2.isEmpty()) {
            i12 = i3 - 2;
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
                str = i12 < arrayList2.size() ? ((org.telegram.messenger.hi) arrayList2.get(i12)).a : ((org.telegram.messenger.hi) arrayList3.get((i12 - arrayList2.size()) - 1)).a;
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
                nxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
            } else {
                nxVar.setPadding(0, 0, 0, 0);
            }
            if (document == null) {
                nxVar.a(null, z10);
                if (nxVar.getSpan() == null || nxVar.getSpan().document != document) {
                    nxVar.setSpan(new p5(document, (Paint.FontMetricsInt) null));
                }
            } else if (l10 != null) {
                nxVar.a(null, z10);
                if (nxVar.getSpan() == null || nxVar.getSpan().getDocumentId() != l10.longValue()) {
                    nxVar.setSpan(new p5(l10.longValue(), (Paint.FontMetricsInt) null));
                }
            } else if (str3 != null) {
                nxVar.a(org.telegram.messenger.i6.f(str3), z10);
                nxVar.setSpan(null);
            } else {
                nxVar.a(null, z10);
                nxVar.setSpan(null);
            }
            nxVar.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l10 = null;
        if (document == null) {
        }
        nxVar.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        if (document == null) {
        }
        nxVar.setTag(str4);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        ey eyVar = this.G;
        org.telegram.ui.ActionBar.e6 e6Var = eyVar.a2;
        if (i3 == 0) {
            view = new nx(eyVar.getContext());
        } else if (i3 == 1) {
            View view2 = new View(eyVar.getContext());
            view2.setLayoutParams(new u4.p0(-1, eyVar.c1));
            view = view2;
        } else if (i3 == 3) {
            view = new org.telegram.ui.Cells.i8(eyVar.getContext(), true, false, eyVar.a2, eyVar.j2);
        } else if (i3 == 4) {
            ViewGroup.LayoutParams p0Var = new u4.p0(-1, org.telegram.messenger.g0.L(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(p0Var);
            view = view3;
        } else if (i3 != 5) {
            ai.o2 o2Var = new ai.o2(20, eyVar.getContext(), this);
            TextView textView = new TextView(eyVar.getContext());
            textView.setText(org.telegram.messenger.bd.M0(2131748221, null));
            textView.setTextSize(1, 16.0f);
            int i10 = org.telegram.ui.ActionBar.k6.Af;
            org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
            o2Var.addView(textView, b8.mf.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(eyVar.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
            o2Var.addView(imageView, b8.mf.e(48, 48, 85));
            imageView.setOnClickListener(new androidx.mediarouter.app.w(this, 10));
            o2Var.setLayoutParams(new u4.p0(-1, -2));
            view = o2Var;
        } else {
            View view4 = new View(eyVar.getContext());
            view4.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(68.0f)));
            view = view4;
        }
        return new bj0(view);
    }
}
