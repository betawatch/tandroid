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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ty extends hm0 {
    public boolean E;
    public final /* synthetic */ tz F;
    public final my c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String v;
    public String w;
    public sy x;
    public boolean y;

    public ty(tz tzVar, Context context) {
        this.F = tzVar;
        my myVar = new my(context, tzVar.c1, new d(this, 11), new tv(this, 1), tzVar.Z1);
        this.c = myVar;
        myVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        myVar.setClipToPadding(false);
        myVar.W2.r = false;
        myVar.setNestedScrollingEnabled(false);
        myVar.setDrawSelection(false);
        myVar.setOnTouchListener(new m.d2(this, 1));
    }

    public static void E(ty tyVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        tz tzVar = tyVar.F;
        String[] strArr = tzVar.W0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = tyVar.v;
        if (str2 == null) {
            return;
        }
        MediaDataController.getInstance(tzVar.c1).searchStickers(true, str, str2, new ci.y2((Object) tyVar, str2, arrayList, (Object) runnable, 9), z10);
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 0 || i10 == 4;
    }

    public final void F(String str, boolean z10) {
        tz tzVar = this.F;
        ey eyVar = tzVar.P;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.g0 adapter = eyVar.getAdapter();
            ay ayVar = tzVar.R;
            if (adapter != ayVar) {
                eyVar.setAdapter(ayVar);
                this.y = false;
            }
            this.d = 0L;
            tzVar.b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        sy syVar = this.x;
        if (syVar != null) {
            AndroidUtilities.cancelRunOnUIThread(syVar);
        }
        if (TextUtils.isEmpty(this.v)) {
            return;
        }
        this.n.clear();
        this.E = false;
        tzVar.V.e(true);
        sy syVar2 = new sy(this);
        this.x = syVar2;
        AndroidUtilities.runOnUIThread(syVar2, z10 ? 300L : 0L);
    }

    @Override // s4.g0
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
    @Override // s4.g0
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

    @Override // s4.g0
    public final void l() {
        this.c.W2.N(false);
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0124  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        String str2;
        TLRPC.Document document;
        boolean z10;
        String str3;
        String str4;
        Long l4;
        int i11 = b1Var.f;
        View view = b1Var.a;
        ArrayList arrayList = this.s;
        int i12 = 1;
        ArrayList arrayList2 = this.h;
        if (i11 != 0) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            if (this.d != 0) {
                n8Var.b(0, LocaleController.formatPluralString("EmojiCount", this.f.size(), new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i12 = 3;
            } else if (!arrayList2.isEmpty()) {
                i12 = 2;
            }
            if (i10 == arrayList2.size() + i12) {
                n8Var.b(0, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                return;
            } else {
                n8Var.b(0, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                return;
            }
        }
        cz czVar = (cz) view;
        czVar.a = i10;
        czVar.e = null;
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
                        czVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                    } else {
                        czVar.setPadding(0, 0, 0, 0);
                    }
                    if (document == null) {
                        czVar.a(null, z10);
                        if (czVar.getSpan() == null || czVar.getSpan().document != document) {
                            czVar.setSpan(new a6(document, (Paint.FontMetricsInt) null));
                        }
                    } else if (l4 != null) {
                        czVar.a(null, z10);
                        if (czVar.getSpan() == null || czVar.getSpan().getDocumentId() != l4.longValue()) {
                            czVar.setSpan(new a6(l4.longValue(), (Paint.FontMetricsInt) null));
                        }
                    } else if (str3 != null) {
                        czVar.a(Emoji.getEmojiBigDrawable(str3), z10);
                        czVar.setSpan(null);
                    } else {
                        czVar.a(null, z10);
                        czVar.setSpan(null);
                    }
                    czVar.setTag(str4);
                }
                str3 = str2;
                str4 = str;
                l4 = null;
                if (document == null) {
                }
                czVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                if (document == null) {
                }
                czVar.setTag(str4);
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
            czVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            if (document == null) {
            }
            czVar.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l4 = null;
        if (document == null) {
        }
        czVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        if (document == null) {
        }
        czVar.setTag(str4);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        tz tzVar = this.F;
        if (i10 == 0) {
            view = new cz(tzVar.getContext());
        } else if (i10 == 1) {
            View view2 = new View(tzVar.getContext());
            view2.setLayoutParams(new s4.o0(-1, tzVar.b1));
            view = view2;
        } else if (i10 == 3) {
            view = new org.telegram.ui.Cells.n8(tzVar.getContext(), true, false, tzVar.Z1, tzVar.i2);
        } else if (i10 == 4) {
            ViewGroup.LayoutParams o0Var = new s4.o0(-1, AndroidUtilities.dp(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(o0Var);
            view = view3;
        } else if (i10 != 5) {
            ah.x xVar = new ah.x(this, tzVar.getContext(), 17);
            TextView textView = new TextView(tzVar.getContext());
            org.telegram.messenger.lk.j(16.0f, R.string.NoEmojiFound, 1, textView);
            int i11 = org.telegram.ui.ActionBar.h6.Le;
            textView.setTextColor(tzVar.A(i11));
            xVar.addView(textView, w7.z5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(tzVar.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            imageView.setColorFilter(new PorterDuffColorFilter(tzVar.A(i11), PorterDuff.Mode.MULTIPLY));
            xVar.addView(imageView, w7.z5.e(48, 48, 85));
            imageView.setOnClickListener(new oy(this));
            xVar.setLayoutParams(new s4.o0(-1, -2));
            view = xVar;
        } else {
            View view4 = new View(tzVar.getContext());
            view4.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(68.0f)));
            view = view4;
        }
        return new sl0(view);
    }
}
