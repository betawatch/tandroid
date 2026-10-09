package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zy extends pm0 {
    public boolean E;
    public final /* synthetic */ a00 F;
    public final uy c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String v;
    public String w;
    public yy x;
    public boolean y;

    public zy(a00 a00Var, Context context) {
        this.F = a00Var;
        uy uyVar = new uy(context, a00Var.c1, new d(this, 11), new bw(this, 1), a00Var.Z1);
        this.c = uyVar;
        uyVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        uyVar.setClipToPadding(false);
        uyVar.W2.r = false;
        uyVar.setNestedScrollingEnabled(false);
        uyVar.setDrawSelection(false);
        uyVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(zy zyVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        a00 a00Var = zyVar.F;
        String[] strArr = a00Var.W0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = zyVar.v;
        if (str2 == null) {
            return;
        }
        MediaDataController.getInstance(a00Var.c1).searchStickers(true, str, str2, new ai.f4((Object) zyVar, str2, arrayList, (Object) runnable, 9), z10);
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f;
        return i10 == 0 || i10 == 4;
    }

    public final void F(String str, boolean z10) {
        a00 a00Var = this.F;
        my myVar = a00Var.P;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.i0 adapter = myVar.getAdapter();
            jy jyVar = a00Var.R;
            if (adapter != jyVar) {
                myVar.setAdapter(jyVar);
                this.y = false;
            }
            this.d = 0L;
            a00Var.b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        yy yyVar = this.x;
        if (yyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(yyVar);
        }
        if (TextUtils.isEmpty(this.v)) {
            return;
        }
        this.n.clear();
        this.E = false;
        a00Var.V.e(true);
        yy yyVar2 = new yy(this);
        this.x = yyVar2;
        AndroidUtilities.runOnUIThread(yyVar2, z10 ? 300L : 0L);
    }

    @Override // s4.i0
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
    @Override // s4.i0
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

    @Override // s4.i0
    public final void l() {
        this.c.W2.N(false);
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0124  */
    @Override // s4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.d1 d1Var, int i10) {
        String str;
        String str2;
        TLRPC.Document document;
        boolean z10;
        String str3;
        String str4;
        Long l4;
        int i11 = d1Var.f;
        View view = d1Var.a;
        ArrayList arrayList = this.s;
        int i12 = 1;
        ArrayList arrayList2 = this.h;
        if (i11 != 0) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            if (this.d != 0) {
                o8Var.b(0, LocaleController.formatPluralString("EmojiCount", this.f.size(), new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i12 = 3;
            } else if (!arrayList2.isEmpty()) {
                i12 = 2;
            }
            if (i10 == arrayList2.size() + i12) {
                o8Var.b(0, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                return;
            } else {
                o8Var.b(0, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                return;
            }
        }
        iz izVar = (iz) view;
        izVar.a = i10;
        izVar.e = null;
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
                        izVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                    } else {
                        izVar.setPadding(0, 0, 0, 0);
                    }
                    if (document == null) {
                        izVar.a(null, z10);
                        if (izVar.getSpan() == null || izVar.getSpan().document != document) {
                            izVar.setSpan(new b6(document, (Paint.FontMetricsInt) null));
                        }
                    } else if (l4 != null) {
                        izVar.a(null, z10);
                        if (izVar.getSpan() == null || izVar.getSpan().getDocumentId() != l4.longValue()) {
                            izVar.setSpan(new b6(l4.longValue(), (Paint.FontMetricsInt) null));
                        }
                    } else if (str3 != null) {
                        izVar.a(Emoji.getEmojiBigDrawable(str3), z10);
                        izVar.setSpan(null);
                    } else {
                        izVar.a(null, z10);
                        izVar.setSpan(null);
                    }
                    izVar.setTag(str4);
                }
                str3 = str2;
                str4 = str;
                l4 = null;
                if (document == null) {
                }
                izVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                if (document == null) {
                }
                izVar.setTag(str4);
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
            izVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            if (document == null) {
            }
            izVar.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l4 = null;
        if (document == null) {
        }
        izVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        if (document == null) {
        }
        izVar.setTag(str4);
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        a00 a00Var = this.F;
        if (i10 == 0) {
            view = new iz(a00Var.getContext());
        } else if (i10 == 1) {
            View view2 = new View(a00Var.getContext());
            view2.setLayoutParams(new s4.q0(-1, a00Var.b1));
            view = view2;
        } else if (i10 == 3) {
            view = new org.telegram.ui.Cells.o8(a00Var.getContext(), true, false, a00Var.Z1, a00Var.i2);
        } else if (i10 == 4) {
            ViewGroup.LayoutParams q0Var = new s4.q0(-1, AndroidUtilities.dp(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(q0Var);
            view = view3;
        } else if (i10 != 5) {
            ai.f0 f0Var = new ai.f0(this, a00Var.getContext(), 13);
            TextView textView = new TextView(a00Var.getContext());
            org.telegram.messenger.bi.j(16.0f, R.string.NoEmojiFound, 1, textView);
            int i11 = org.telegram.ui.ActionBar.i6.Le;
            textView.setTextColor(a00Var.B(i11));
            f0Var.addView(textView, w7.x5.a(-2.0f, 0.0f, 10.0f, 0.0f, 0.0f, -2, 49));
            ImageView imageView = new ImageView(a00Var.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            imageView.setColorFilter(new PorterDuffColorFilter(a00Var.B(i11), PorterDuff.Mode.MULTIPLY));
            f0Var.addView(imageView, w7.x5.e(48, 48, 85));
            imageView.setOnClickListener(new wy(this));
            f0Var.setLayoutParams(new s4.q0(-1, -2));
            view = f0Var;
        } else {
            View view4 = new View(a00Var.getContext());
            view4.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(68.0f)));
            view = view4;
        }
        return new am0(view);
    }
}
