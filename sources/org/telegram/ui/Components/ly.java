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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ly extends vl0 {
    public boolean E;
    public final /* synthetic */ lz F;
    public final gy c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String v;
    public String w;
    public ky x;
    public boolean y;

    public ly(lz lzVar, Context context) {
        this.F = lzVar;
        gy gyVar = new gy(context, lzVar.c1, new d(this, 11), new mv(this, 1), lzVar.Z1);
        this.c = gyVar;
        gyVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        gyVar.setClipToPadding(false);
        gyVar.Y2.r = false;
        gyVar.setNestedScrollingEnabled(false);
        gyVar.setDrawSelection(false);
        gyVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(ly lyVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        lz lzVar = lyVar.F;
        String[] strArr = lzVar.W0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = lyVar.v;
        if (str2 == null) {
            return;
        }
        MediaDataController.getInstance(lzVar.c1).searchStickers(true, str, str2, new ai.e4((Object) lyVar, str2, arrayList, (Object) runnable, 9), z10);
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 4;
    }

    public final void F(String str, boolean z10) {
        lz lzVar = this.F;
        xx xxVar = lzVar.P;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.h0 adapter = xxVar.getAdapter();
            ux uxVar = lzVar.R;
            if (adapter != uxVar) {
                xxVar.setAdapter(uxVar);
                this.y = false;
            }
            this.d = 0L;
            lzVar.b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        ky kyVar = this.x;
        if (kyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kyVar);
        }
        if (TextUtils.isEmpty(this.v)) {
            return;
        }
        this.n.clear();
        this.E = false;
        lzVar.V.e(true);
        ky kyVar2 = new ky(this);
        this.x = kyVar2;
        AndroidUtilities.runOnUIThread(kyVar2, z10 ? 300L : 0L);
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
    
        if (r9 == 2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0052, code lost:
    
        if (r9 == 1) goto L49;
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
        this.c.Y2.N(false);
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        TLRPC.Document document;
        boolean z10;
        String str3;
        String str4;
        Long l4;
        int i11 = c1Var.f;
        View view = c1Var.a;
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
        uy uyVar = (uy) view;
        uyVar.a = i10;
        uyVar.e = null;
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
                document = null;
                z10 = true;
                if (str != null && str.startsWith("animated_")) {
                    try {
                        l4 = Long.valueOf(Long.parseLong(str.substring(9)));
                        str4 = null;
                        str3 = null;
                    } catch (Exception unused) {
                    }
                    if (document == null || l4 != null) {
                        uyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                    } else {
                        uyVar.setPadding(0, 0, 0, 0);
                    }
                    if (document == null) {
                        uyVar.a(null, z10);
                        if (uyVar.getSpan() == null || uyVar.getSpan().document != document) {
                            uyVar.setSpan(new z5(document, (Paint.FontMetricsInt) null));
                        }
                    } else if (l4 != null) {
                        uyVar.a(null, z10);
                        if (uyVar.getSpan() == null || uyVar.getSpan().getDocumentId() != l4.longValue()) {
                            uyVar.setSpan(new z5(l4.longValue(), (Paint.FontMetricsInt) null));
                        }
                    } else if (str3 != null) {
                        uyVar.a(Emoji.getEmojiBigDrawable(str3), z10);
                        uyVar.setSpan(null);
                    } else {
                        uyVar.a(null, z10);
                        uyVar.setSpan(null);
                    }
                    uyVar.setTag(str4);
                }
                str3 = str2;
                str4 = str;
                l4 = null;
                if (document == null) {
                }
                uyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                if (document == null) {
                }
                uyVar.setTag(str4);
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
            uyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            if (document == null) {
            }
            uyVar.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l4 = null;
        if (document == null) {
        }
        uyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        if (document == null) {
        }
        uyVar.setTag(str4);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        lz lzVar = this.F;
        if (i10 == 0) {
            view = new uy(lzVar.getContext());
        } else if (i10 == 1) {
            View view2 = new View(lzVar.getContext());
            view2.setLayoutParams(new s4.p0(-1, lzVar.b1));
            view = view2;
        } else if (i10 == 3) {
            view = new org.telegram.ui.Cells.o8(lzVar.getContext(), true, false, lzVar.Z1, lzVar.i2);
        } else if (i10 == 4) {
            ViewGroup.LayoutParams p0Var = new s4.p0(-1, AndroidUtilities.dp(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(p0Var);
            view = view3;
        } else if (i10 != 5) {
            ai.f0 f0Var = new ai.f0(this, lzVar.getContext(), 13);
            TextView textView = new TextView(lzVar.getContext());
            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
            textView.setTextSize(1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.h6.Le;
            textView.setTextColor(lzVar.z(i11));
            f0Var.addView(textView, w7.y5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(lzVar.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            imageView.setColorFilter(new PorterDuffColorFilter(lzVar.z(i11), PorterDuff.Mode.MULTIPLY));
            f0Var.addView(imageView, w7.y5.e(48, 48, 85));
            imageView.setOnClickListener(new iy(this));
            f0Var.setLayoutParams(new s4.p0(-1, -2));
            view = f0Var;
        } else {
            View view4 = new View(lzVar.getContext());
            view4.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(68.0f)));
            view = view4;
        }
        return new gl0(view);
    }
}
