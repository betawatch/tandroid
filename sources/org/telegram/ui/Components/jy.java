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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jy extends ql0 {
    public boolean B;
    public final /* synthetic */ kz C;
    public final dy c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String v;
    public String w;
    public iy x;
    public boolean y;

    public jy(kz kzVar, Context context) {
        this.C = kzVar;
        dy dyVar = new dy(context, kzVar.Z0, new d(this, 11), new ev(this, 1), kzVar.W1);
        this.c = dyVar;
        dyVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        dyVar.setClipToPadding(false);
        dyVar.V2.r = false;
        dyVar.setNestedScrollingEnabled(false);
        dyVar.setDrawSelection(false);
        dyVar.setOnTouchListener(new m.d2(this, 1));
    }

    public static void E(jy jyVar, Runnable runnable, ArrayList arrayList, boolean z4) {
        kz kzVar = jyVar.C;
        String[] strArr = kzVar.T0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = jyVar.v;
        if (str2 == null) {
            return;
        }
        MediaDataController.getInstance(kzVar.Z0).searchStickers(true, str, str2, new gg.c1((Object) jyVar, str2, arrayList, (Object) runnable, 10), z4);
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 0 || i10 == 4;
    }

    public final void F(String str, boolean z4) {
        kz kzVar = this.C;
        ix ixVar = kzVar.M;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            f2.o0 adapter = ixVar.getAdapter();
            rx rxVar = kzVar.O;
            if (adapter != rxVar) {
                ixVar.setAdapter(rxVar);
                this.y = false;
            }
            this.d = 0L;
            kzVar.b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        iy iyVar = this.x;
        if (iyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(iyVar);
        }
        if (TextUtils.isEmpty(this.v)) {
            return;
        }
        this.n.clear();
        this.B = false;
        kzVar.S.e(true);
        iy iyVar2 = new iy(this);
        this.x = iyVar2;
        AndroidUtilities.runOnUIThread(iyVar2, z4 ? 300L : 0L);
    }

    @Override // f2.o0
    public final int h() {
        if (this.d != 0) {
            return this.f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.s;
        ArrayList arrayList3 = this.r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.y) {
            return this.C.getRecentEmoji().size() + 1;
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
    @Override // f2.o0
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

    @Override // f2.o0
    public final void l() {
        this.c.V2.N(false);
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        String str2;
        TLRPC.Document document;
        boolean z4;
        String str3;
        String str4;
        Long l10;
        int i11 = l1Var.f;
        View view = l1Var.a;
        ArrayList arrayList = this.s;
        int i12 = 1;
        ArrayList arrayList2 = this.h;
        if (i11 != 0) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            if (this.d != 0) {
                l8Var.b(0, LocaleController.formatPluralString("EmojiCount", this.f.size(), new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i12 = 3;
            } else if (!arrayList2.isEmpty()) {
                i12 = 2;
            }
            if (i10 == arrayList2.size() + i12) {
                l8Var.b(0, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                return;
            } else {
                l8Var.b(0, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                return;
            }
        }
        sy syVar = (sy) view;
        syVar.a = i10;
        syVar.e = null;
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
                str = this.C.getRecentEmoji().get(i13);
                str2 = str;
                document = null;
                z4 = true;
                if (str != null && str.startsWith("animated_")) {
                    try {
                        l10 = Long.valueOf(Long.parseLong(str.substring(9)));
                        str4 = null;
                        str3 = null;
                    } catch (Exception unused) {
                    }
                    if (document == null || l10 != null) {
                        syVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                    } else {
                        syVar.setPadding(0, 0, 0, 0);
                    }
                    if (document == null) {
                        syVar.a(null, z4);
                        if (syVar.getSpan() == null || syVar.getSpan().document != document) {
                            syVar.setSpan(new u5(document, (Paint.FontMetricsInt) null));
                        }
                    } else if (l10 != null) {
                        syVar.a(null, z4);
                        if (syVar.getSpan() == null || syVar.getSpan().getDocumentId() != l10.longValue()) {
                            syVar.setSpan(new u5(l10.longValue(), (Paint.FontMetricsInt) null));
                        }
                    } else if (str3 != null) {
                        syVar.a(Emoji.getEmojiBigDrawable(str3), z4);
                        syVar.setSpan(null);
                    } else {
                        syVar.a(null, z4);
                        syVar.setSpan(null);
                    }
                    syVar.setTag(str4);
                }
                str3 = str2;
                str4 = str;
                l10 = null;
                if (document == null) {
                }
                syVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                if (document == null) {
                }
                syVar.setTag(str4);
            }
            str = i13 < arrayList2.size() ? ((MediaDataController.KeywordResult) arrayList2.get(i13)).emoji : ((MediaDataController.KeywordResult) arrayList3.get((i13 - arrayList2.size()) - 1)).emoji;
            str2 = str;
            document = null;
        }
        z4 = false;
        if (str != null) {
            l10 = Long.valueOf(Long.parseLong(str.substring(9)));
            str4 = null;
            str3 = null;
            if (document == null) {
            }
            syVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            if (document == null) {
            }
            syVar.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l10 = null;
        if (document == null) {
        }
        syVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        if (document == null) {
        }
        syVar.setTag(str4);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        kz kzVar = this.C;
        if (i10 == 0) {
            view = new sy(kzVar.getContext());
        } else if (i10 == 1) {
            View view2 = new View(kzVar.getContext());
            view2.setLayoutParams(new f2.w0(-1, kzVar.Y0));
            view = view2;
        } else if (i10 == 3) {
            view = new org.telegram.ui.Cells.l8(kzVar.getContext(), true, false, kzVar.W1, kzVar.f2);
        } else if (i10 == 4) {
            ViewGroup.LayoutParams w0Var = new f2.w0(-1, AndroidUtilities.dp(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(w0Var);
            view = view3;
        } else if (i10 != 5) {
            dg.u2 u2Var = new dg.u2(this, kzVar.getContext(), 19);
            TextView textView = new TextView(kzVar.getContext());
            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
            textView.setTextSize(1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.j6.Le;
            textView.setTextColor(kzVar.A(i11));
            u2Var.addView(textView, k7.b6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(kzVar.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            imageView.setColorFilter(new PorterDuffColorFilter(kzVar.A(i11), PorterDuff.Mode.MULTIPLY));
            u2Var.addView(imageView, k7.b6.e(48, 48, 85));
            imageView.setOnClickListener(new gy(this));
            u2Var.setLayoutParams(new f2.w0(-1, -2));
            view = u2Var;
        } else {
            View view4 = new View(kzVar.getContext());
            view4.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(68.0f)));
            view = view4;
        }
        return new dl0(view);
    }
}
