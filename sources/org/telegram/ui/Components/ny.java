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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ny extends yl0 {
    public boolean E;
    public final /* synthetic */ nz F;
    public final iy c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String v;
    public String w;
    public my x;
    public boolean y;

    public ny(nz nzVar, Context context) {
        this.F = nzVar;
        iy iyVar = new iy(context, nzVar.c1, new d(this, 11), new pv(this, 1), nzVar.Z1);
        this.c = iyVar;
        iyVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        iyVar.setClipToPadding(false);
        iyVar.f3.r = false;
        iyVar.setNestedScrollingEnabled(false);
        iyVar.setDrawSelection(false);
        iyVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(ny nyVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        nz nzVar = nyVar.F;
        String[] strArr = nzVar.W0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = nyVar.v;
        if (str2 == null) {
            return;
        }
        MediaDataController.getInstance(nzVar.c1).searchStickers(true, str, str2, new ai.e4((Object) nyVar, str2, arrayList, (Object) runnable, 9), z10);
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 4;
    }

    public final void F(String str, boolean z10) {
        nz nzVar = this.F;
        zx zxVar = nzVar.P;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.h0 adapter = zxVar.getAdapter();
            wx wxVar = nzVar.R;
            if (adapter != wxVar) {
                zxVar.setAdapter(wxVar);
                this.y = false;
            }
            this.d = 0L;
            nzVar.b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        my myVar = this.x;
        if (myVar != null) {
            AndroidUtilities.cancelRunOnUIThread(myVar);
        }
        if (TextUtils.isEmpty(this.v)) {
            return;
        }
        this.n.clear();
        this.E = false;
        nzVar.V.e(true);
        my myVar2 = new my(this);
        this.x = myVar2;
        AndroidUtilities.runOnUIThread(myVar2, z10 ? 300L : 0L);
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
        this.c.f3.N(false);
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
        wy wyVar = (wy) view;
        wyVar.a = i10;
        wyVar.e = null;
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
                        wyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                    } else {
                        wyVar.setPadding(0, 0, 0, 0);
                    }
                    if (document == null) {
                        wyVar.a(null, z10);
                        if (wyVar.getSpan() == null || wyVar.getSpan().document != document) {
                            wyVar.setSpan(new z5(document, (Paint.FontMetricsInt) null));
                        }
                    } else if (l4 != null) {
                        wyVar.a(null, z10);
                        if (wyVar.getSpan() == null || wyVar.getSpan().getDocumentId() != l4.longValue()) {
                            wyVar.setSpan(new z5(l4.longValue(), (Paint.FontMetricsInt) null));
                        }
                    } else if (str3 != null) {
                        wyVar.a(Emoji.getEmojiBigDrawable(str3), z10);
                        wyVar.setSpan(null);
                    } else {
                        wyVar.a(null, z10);
                        wyVar.setSpan(null);
                    }
                    wyVar.setTag(str4);
                }
                str3 = str2;
                str4 = str;
                l4 = null;
                if (document == null) {
                }
                wyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                if (document == null) {
                }
                wyVar.setTag(str4);
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
            wyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            if (document == null) {
            }
            wyVar.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l4 = null;
        if (document == null) {
        }
        wyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        if (document == null) {
        }
        wyVar.setTag(str4);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        nz nzVar = this.F;
        if (i10 == 0) {
            view = new wy(nzVar.getContext());
        } else if (i10 == 1) {
            View view2 = new View(nzVar.getContext());
            view2.setLayoutParams(new s4.p0(-1, nzVar.b1));
            view = view2;
        } else if (i10 == 3) {
            view = new org.telegram.ui.Cells.o8(nzVar.getContext(), true, false, nzVar.Z1, nzVar.i2);
        } else if (i10 == 4) {
            ViewGroup.LayoutParams p0Var = new s4.p0(-1, AndroidUtilities.dp(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(p0Var);
            view = view3;
        } else if (i10 != 5) {
            ai.f0 f0Var = new ai.f0(this, nzVar.getContext(), 13);
            TextView textView = new TextView(nzVar.getContext());
            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
            textView.setTextSize(1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.i6.Le;
            textView.setTextColor(nzVar.z(i11));
            f0Var.addView(textView, w7.z5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(nzVar.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            imageView.setColorFilter(new PorterDuffColorFilter(nzVar.z(i11), PorterDuff.Mode.MULTIPLY));
            f0Var.addView(imageView, w7.z5.e(48, 48, 85));
            imageView.setOnClickListener(new ky(this));
            f0Var.setLayoutParams(new s4.p0(-1, -2));
            view = f0Var;
        } else {
            View view4 = new View(nzVar.getContext());
            view4.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(68.0f)));
            view = view4;
        }
        return new il0(view);
    }
}
