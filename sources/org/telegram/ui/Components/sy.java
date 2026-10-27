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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sy extends mm0 {
    public boolean E;
    public final /* synthetic */ sz F;
    public final ly c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String v;
    public String w;
    public ry x;
    public boolean y;

    public sy(sz szVar, Context context) {
        this.F = szVar;
        ly lyVar = new ly(context, szVar.c1, new d(this, 11), new tv(this, 1), szVar.Z1);
        this.c = lyVar;
        lyVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        lyVar.setClipToPadding(false);
        lyVar.g3.r = false;
        lyVar.setNestedScrollingEnabled(false);
        lyVar.setDrawSelection(false);
        lyVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(sy syVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        sz szVar = syVar.F;
        String[] strArr = szVar.W0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = syVar.v;
        if (str2 == null) {
            return;
        }
        MediaDataController.getInstance(szVar.c1).searchStickers(true, str, str2, new di.y2((Object) syVar, str2, arrayList, (Object) runnable, 9), z10);
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 0 || i10 == 4;
    }

    public final void F(String str, boolean z10) {
        sz szVar = this.F;
        dy dyVar = szVar.P;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.h0 adapter = dyVar.getAdapter();
            zx zxVar = szVar.R;
            if (adapter != zxVar) {
                dyVar.setAdapter(zxVar);
                this.y = false;
            }
            this.d = 0L;
            szVar.b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        ry ryVar = this.x;
        if (ryVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ryVar);
        }
        if (TextUtils.isEmpty(this.v)) {
            return;
        }
        this.n.clear();
        this.E = false;
        szVar.V.e(true);
        ry ryVar2 = new ry(this);
        this.x = ryVar2;
        AndroidUtilities.runOnUIThread(ryVar2, z10 ? 300L : 0L);
    }

    @Override // s4.h0
    public final int h() {
        if (this.d != 0) {
            return this.f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.s;
        ArrayList arrayList3 = this.r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.y) {
            return this.F.getRecentEmoji().size() + 1;
        }
        int i10 = 2;
        if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
            return 2;
        }
        if (!arrayList2.isEmpty()) {
            i10 = 3;
        } else if (arrayList.isEmpty()) {
            i10 = 1;
        }
        int size = arrayList.size() + i10;
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
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(int i10) {
        int i11 = 2;
        if (this.d != 0) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return 4;
                }
                if (i10 != 2) {
                    return i10 == h() - 1 ? 5 : 0;
                }
                return 3;
            }
            return 1;
        }
        if (i10 != 0) {
            ArrayList arrayList = this.s;
            ArrayList arrayList2 = this.r;
            ArrayList arrayList3 = this.h;
            if (i10 == 1 && this.y && arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                return 2;
            }
            if (arrayList.isEmpty()) {
                if (!arrayList3.isEmpty()) {
                }
                if (arrayList2.isEmpty()) {
                    return 0;
                }
                if (!arrayList.isEmpty()) {
                    i11 = 3;
                } else if (arrayList3.isEmpty()) {
                    i11 = 1;
                }
                if (i10 != arrayList3.size() + i11) {
                    return 0;
                }
            } else if (i10 == 1) {
                return 4;
            }
            return 3;
        }
        return 1;
    }

    @Override // s4.h0
    public final void l() {
        this.c.g3.O(false);
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0124  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        String str2;
        TLRPC.Document document;
        boolean z10;
        String str3;
        String str4;
        Long l4;
        int i11 = e1Var.f;
        View view = e1Var.a;
        ArrayList arrayList = this.s;
        int i12 = 1;
        ArrayList arrayList2 = this.h;
        if (i11 != 0) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            if (this.d != 0) {
                s8Var.a(0, LocaleController.formatPluralString("EmojiCount", this.f.size(), new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i12 = 3;
            } else if (!arrayList2.isEmpty()) {
                i12 = 2;
            }
            if (i10 == arrayList2.size() + i12) {
                s8Var.a(0, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                return;
            } else {
                s8Var.a(0, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                return;
            }
        }
        bz bzVar = (bz) view;
        bzVar.a = i10;
        bzVar.e = null;
        int i13 = i10 - 1;
        if (!arrayList.isEmpty() || this.d != 0) {
            i13 = i10 - 3;
        } else if (!arrayList2.isEmpty()) {
            i13 = i10 - 2;
        }
        if (this.d != 0) {
            document = (TLRPC.Document) this.f.get(i13);
            str = null;
            str2 = null;
        } else {
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.r;
            if (isEmpty && arrayList3.isEmpty() && !this.y) {
                str = this.F.getRecentEmoji().get(i13);
                str2 = str;
                z10 = true;
                document = null;
                if (str != null && str.startsWith("animated_")) {
                    try {
                        l4 = Long.valueOf(Long.parseLong(str.substring(9)));
                        str4 = null;
                        str3 = null;
                    } catch (Exception unused) {
                    }
                    if (document == null || l4 != null) {
                        bzVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                    } else {
                        bzVar.setPadding(0, 0, 0, 0);
                    }
                    if (document == null) {
                        bzVar.a(null, z10);
                        if (bzVar.getSpan() == null || bzVar.getSpan().document != document) {
                            bzVar.setSpan(new c6(document, (Paint.FontMetricsInt) null));
                        }
                    } else if (l4 != null) {
                        bzVar.a(null, z10);
                        if (bzVar.getSpan() == null || bzVar.getSpan().getDocumentId() != l4.longValue()) {
                            bzVar.setSpan(new c6(l4.longValue(), (Paint.FontMetricsInt) null));
                        }
                    } else if (str3 != null) {
                        bzVar.a(Emoji.getEmojiBigDrawable(str3), z10);
                        bzVar.setSpan(null);
                    } else {
                        bzVar.a(null, z10);
                        bzVar.setSpan(null);
                    }
                    bzVar.setTag(str4);
                }
                str3 = str2;
                str4 = str;
                l4 = null;
                if (document == null) {
                }
                bzVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                if (document == null) {
                }
                bzVar.setTag(str4);
            }
            str = i13 < arrayList2.size() ? ((MediaDataController.KeywordResult) arrayList2.get(i13)).emoji : ((MediaDataController.KeywordResult) arrayList3.get((i13 - arrayList2.size()) - 1)).emoji;
            str2 = str;
            document = null;
        }
        z10 = false;
        if (str != null) {
            l4 = Long.valueOf(Long.parseLong(str.substring(9)));
            str4 = null;
            str3 = null;
            if (document == null) {
            }
            bzVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            if (document == null) {
            }
            bzVar.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l4 = null;
        if (document == null) {
        }
        bzVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        if (document == null) {
        }
        bzVar.setTag(str4);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        sz szVar = this.F;
        org.telegram.ui.ActionBar.u6 u6Var = szVar.Z1;
        if (i10 == 0) {
            view = new bz(szVar.getContext());
        } else if (i10 == 1) {
            View view2 = new View(szVar.getContext());
            view2.setLayoutParams(new s4.q0(-1, szVar.b1));
            view = view2;
        } else if (i10 == 3) {
            view = new org.telegram.ui.Cells.s8(szVar.getContext(), true, false, szVar.Z1, szVar.i2);
        } else if (i10 == 4) {
            ViewGroup.LayoutParams q0Var = new s4.q0(-1, AndroidUtilities.dp(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(q0Var);
            view = view3;
        } else if (i10 != 5) {
            bh.r rVar = new bh.r(this, szVar.getContext(), 16);
            TextView textView = new TextView(szVar.getContext());
            org.telegram.ui.d3.o(R.string.NoEmojiFound, textView, 1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.y6.Le;
            org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
            rVar.addView(textView, kb1.h(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(szVar.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.MULTIPLY);
            rVar.addView(imageView, kb1.i(48, 48, 85));
            imageView.setOnClickListener(new ny(this));
            rVar.setLayoutParams(new s4.q0(-1, -2));
            view = rVar;
        } else {
            View view4 = new View(szVar.getContext());
            view4.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(68.0f)));
            view = view4;
        }
        return new wl0(view);
    }
}
