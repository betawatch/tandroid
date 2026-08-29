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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ey extends il0 {
    public boolean A;
    public final /* synthetic */ fz B;
    public final yx c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String v;
    public String w;
    public dy x;
    public boolean y;

    public ey(fz fzVar, Context context) {
        this.B = fzVar;
        yx yxVar = new yx(context, fzVar.Y0, new d(this, 11), new cv(this, 1), fzVar.V1);
        this.c = yxVar;
        yxVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        yxVar.setClipToPadding(false);
        yxVar.U2.r = false;
        yxVar.setNestedScrollingEnabled(false);
        yxVar.setDrawSelection(false);
        yxVar.setOnTouchListener(new m.d2(this, 1));
    }

    public static void E(ey eyVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        fz fzVar = eyVar.B;
        String[] strArr = fzVar.S0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = eyVar.v;
        if (str2 == null) {
            return;
        }
        MediaDataController.getInstance(fzVar.Y0).searchStickers(true, str, str2, new eg.d1((Object) eyVar, str2, (Object) arrayList, (Object) runnable, 10), z10);
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 0 || i10 == 4;
    }

    public final void F(String str, boolean z10) {
        fz fzVar = this.B;
        dx dxVar = fzVar.L;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            f2.p0 adapter = dxVar.getAdapter();
            nx nxVar = fzVar.N;
            if (adapter != nxVar) {
                dxVar.setAdapter(nxVar);
                this.y = false;
            }
            this.d = 0L;
            fzVar.b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        dy dyVar = this.x;
        if (dyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(dyVar);
        }
        if (TextUtils.isEmpty(this.v)) {
            return;
        }
        this.n.clear();
        this.A = false;
        fzVar.R.e(true);
        dy dyVar2 = new dy(this);
        this.x = dyVar2;
        AndroidUtilities.runOnUIThread(dyVar2, z10 ? 300L : 0L);
    }

    @Override // f2.p0
    public final int h() {
        if (this.d != 0) {
            return this.f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.s;
        ArrayList arrayList3 = this.r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.y) {
            return this.B.getRecentEmoji().size() + 1;
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
    @Override // f2.p0
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

    @Override // f2.p0
    public final void l() {
        this.c.U2.N(false);
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
        String str;
        String str2;
        TLRPC.Document document;
        boolean z10;
        String str3;
        String str4;
        Long l10;
        int i11 = n1Var.f;
        View view = n1Var.a;
        ArrayList arrayList = this.s;
        int i12 = 1;
        ArrayList arrayList2 = this.h;
        if (i11 != 0) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
            if (this.d != 0) {
                k8Var.b(0, LocaleController.formatPluralString("EmojiCount", this.f.size(), new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i12 = 3;
            } else if (!arrayList2.isEmpty()) {
                i12 = 2;
            }
            if (i10 == arrayList2.size() + i12) {
                k8Var.b(0, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                return;
            } else {
                k8Var.b(0, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                return;
            }
        }
        ny nyVar = (ny) view;
        nyVar.a = i10;
        nyVar.e = null;
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
                str = this.B.getRecentEmoji().get(i13);
                str2 = str;
                document = null;
                z10 = true;
                if (str != null && str.startsWith("animated_")) {
                    try {
                        l10 = Long.valueOf(Long.parseLong(str.substring(9)));
                        str4 = null;
                        str3 = null;
                    } catch (Exception unused) {
                    }
                    if (document == null || l10 != null) {
                        nyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                    } else {
                        nyVar.setPadding(0, 0, 0, 0);
                    }
                    if (document == null) {
                        nyVar.a(null, z10);
                        if (nyVar.getSpan() == null || nyVar.getSpan().document != document) {
                            nyVar.setSpan(new y5(document, (Paint.FontMetricsInt) null));
                        }
                    } else if (l10 != null) {
                        nyVar.a(null, z10);
                        if (nyVar.getSpan() == null || nyVar.getSpan().getDocumentId() != l10.longValue()) {
                            nyVar.setSpan(new y5(l10.longValue(), (Paint.FontMetricsInt) null));
                        }
                    } else if (str3 != null) {
                        nyVar.a(Emoji.getEmojiBigDrawable(str3), z10);
                        nyVar.setSpan(null);
                    } else {
                        nyVar.a(null, z10);
                        nyVar.setSpan(null);
                    }
                    nyVar.setTag(str4);
                }
                str3 = str2;
                str4 = str;
                l10 = null;
                if (document == null) {
                }
                nyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                if (document == null) {
                }
                nyVar.setTag(str4);
            }
            str = i13 < arrayList2.size() ? ((MediaDataController.KeywordResult) arrayList2.get(i13)).emoji : ((MediaDataController.KeywordResult) arrayList3.get((i13 - arrayList2.size()) - 1)).emoji;
            str2 = str;
            document = null;
        }
        z10 = false;
        if (str != null) {
            l10 = Long.valueOf(Long.parseLong(str.substring(9)));
            str4 = null;
            str3 = null;
            if (document == null) {
            }
            nyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            if (document == null) {
            }
            nyVar.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l10 = null;
        if (document == null) {
        }
        nyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        if (document == null) {
        }
        nyVar.setTag(str4);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        fz fzVar = this.B;
        if (i10 == 0) {
            view = new ny(fzVar.getContext());
        } else if (i10 == 1) {
            View view2 = new View(fzVar.getContext());
            view2.setLayoutParams(new f2.x0(-1, fzVar.X0));
            view = view2;
        } else if (i10 == 3) {
            view = new org.telegram.ui.Cells.k8(fzVar.getContext(), true, false, fzVar.V1, fzVar.e2);
        } else if (i10 == 4) {
            ViewGroup.LayoutParams x0Var = new f2.x0(-1, AndroidUtilities.dp(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(x0Var);
            view = view3;
        } else if (i10 != 5) {
            bg.x2 x2Var = new bg.x2(this, fzVar.getContext(), 21);
            TextView textView = new TextView(fzVar.getContext());
            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
            textView.setTextSize(1, 16.0f);
            int i11 = org.telegram.ui.ActionBar.g6.Le;
            textView.setTextColor(fzVar.A(i11));
            x2Var.addView(textView, i7.f6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(fzVar.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            imageView.setColorFilter(new PorterDuffColorFilter(fzVar.A(i11), PorterDuff.Mode.MULTIPLY));
            x2Var.addView(imageView, i7.f6.e(48, 48, 85));
            imageView.setOnClickListener(new ay(this));
            x2Var.setLayoutParams(new f2.x0(-1, -2));
            view = x2Var;
        } else {
            View view4 = new View(fzVar.getContext());
            view4.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(68.0f)));
            view = view4;
        }
        return new vk0(view);
    }
}
