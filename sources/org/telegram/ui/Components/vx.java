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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vx extends vk0 {
    public boolean A;
    public final /* synthetic */ wy B;
    public final qx c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String v;
    public String w;
    public ux x;
    public boolean y;

    public vx(wy wyVar, Context context) {
        this.B = wyVar;
        qx qxVar = new qx(context, wyVar.Y0, new d(this, 11), new wu(this, 1), wyVar.V1);
        this.c = qxVar;
        qxVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        qxVar.setClipToPadding(false);
        qxVar.U2.r = false;
        qxVar.setNestedScrollingEnabled(false);
        qxVar.setDrawSelection(false);
        qxVar.setOnTouchListener(new m.d2(this, 1));
    }

    public static void E(vx vxVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        wy wyVar = vxVar.B;
        String[] strArr = wyVar.S0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = vxVar.v;
        if (str2 == null) {
            return;
        }
        MediaDataController.getInstance(wyVar.Y0).searchStickers(true, str, str2, new bg.j1((Object) vxVar, str2, (Object) arrayList, (Object) runnable, 10), z10);
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 0 || i9 == 4;
    }

    public final void F(String str, boolean z10) {
        wy wyVar = this.B;
        ww wwVar = wyVar.L;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            f2.r0 adapter = wwVar.getAdapter();
            fx fxVar = wyVar.N;
            if (adapter != fxVar) {
                wwVar.setAdapter(fxVar);
                this.y = false;
            }
            this.d = 0L;
            wyVar.b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        ux uxVar = this.x;
        if (uxVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uxVar);
        }
        if (TextUtils.isEmpty(this.v)) {
            return;
        }
        this.n.clear();
        this.A = false;
        wyVar.R.e(true);
        ux uxVar2 = new ux(this);
        this.x = uxVar2;
        AndroidUtilities.runOnUIThread(uxVar2, z10 ? 300L : 0L);
    }

    @Override // f2.r0
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
        int i9 = 2;
        if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
            return 2;
        }
        if (!arrayList2.isEmpty()) {
            i9 = 3;
        } else if (arrayList.isEmpty()) {
            i9 = 1;
        }
        int size = arrayList.size() + i9;
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
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(int i9) {
        int i10 = 2;
        if (this.d != 0) {
            if (i9 != 0) {
                if (i9 == 1) {
                    return 4;
                }
                if (i9 != 2) {
                    return i9 == h() - 1 ? 5 : 0;
                }
                return 3;
            }
            return 1;
        }
        if (i9 != 0) {
            ArrayList arrayList = this.s;
            ArrayList arrayList2 = this.r;
            ArrayList arrayList3 = this.h;
            if (i9 == 1 && this.y && arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
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
                if (i9 != arrayList3.size() + i10) {
                    return 0;
                }
            } else if (i9 == 1) {
                return 4;
            }
            return 3;
        }
        return 1;
    }

    @Override // f2.r0
    public final void l() {
        this.c.U2.N(false);
        super.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        String str2;
        TLRPC.Document document;
        boolean z10;
        String str3;
        String str4;
        Long l10;
        int i10 = q1Var.f;
        View view = q1Var.a;
        ArrayList arrayList = this.s;
        int i11 = 1;
        ArrayList arrayList2 = this.h;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            }
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            if (this.d != 0) {
                m8Var.b(0, LocaleController.formatPluralString("EmojiCount", this.f.size(), new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i11 = 3;
            } else if (!arrayList2.isEmpty()) {
                i11 = 2;
            }
            if (i9 == arrayList2.size() + i11) {
                m8Var.b(0, LocaleController.getString(R.string.StickerOrEmojiGlobalSearchResult));
                return;
            } else {
                m8Var.b(0, LocaleController.getString(R.string.StickerOrEmojiSearchResult));
                return;
            }
        }
        fy fyVar = (fy) view;
        fyVar.a = i9;
        fyVar.e = null;
        int i12 = i9 - 1;
        if (!arrayList.isEmpty() || this.d != 0) {
            i12 = i9 - 3;
        } else if (!arrayList2.isEmpty()) {
            i12 = i9 - 2;
        }
        if (this.d != 0) {
            document = (TLRPC.Document) this.f.get(i12);
            str = null;
            str2 = null;
        } else {
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.r;
            if (isEmpty && arrayList3.isEmpty() && !this.y) {
                str = this.B.getRecentEmoji().get(i12);
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
                        fyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                    } else {
                        fyVar.setPadding(0, 0, 0, 0);
                    }
                    if (document == null) {
                        fyVar.a(null, z10);
                        if (fyVar.getSpan() == null || fyVar.getSpan().document != document) {
                            fyVar.setSpan(new t5(document, (Paint.FontMetricsInt) null));
                        }
                    } else if (l10 != null) {
                        fyVar.a(null, z10);
                        if (fyVar.getSpan() == null || fyVar.getSpan().getDocumentId() != l10.longValue()) {
                            fyVar.setSpan(new t5(l10.longValue(), (Paint.FontMetricsInt) null));
                        }
                    } else if (str3 != null) {
                        fyVar.a(Emoji.getEmojiBigDrawable(str3), z10);
                        fyVar.setSpan(null);
                    } else {
                        fyVar.a(null, z10);
                        fyVar.setSpan(null);
                    }
                    fyVar.setTag(str4);
                }
                str3 = str2;
                str4 = str;
                l10 = null;
                if (document == null) {
                }
                fyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
                if (document == null) {
                }
                fyVar.setTag(str4);
            }
            str = i12 < arrayList2.size() ? ((MediaDataController.KeywordResult) arrayList2.get(i12)).emoji : ((MediaDataController.KeywordResult) arrayList3.get((i12 - arrayList2.size()) - 1)).emoji;
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
            fyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            if (document == null) {
            }
            fyVar.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l10 = null;
        if (document == null) {
        }
        fyVar.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        if (document == null) {
        }
        fyVar.setTag(str4);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        wy wyVar = this.B;
        if (i9 == 0) {
            view = new fy(wyVar.getContext());
        } else if (i9 == 1) {
            View view2 = new View(wyVar.getContext());
            view2.setLayoutParams(new f2.a1(-1, wyVar.X0));
            view = view2;
        } else if (i9 == 3) {
            view = new org.telegram.ui.Cells.m8(wyVar.getContext(), true, false, wyVar.V1, wyVar.e2);
        } else if (i9 == 4) {
            ViewGroup.LayoutParams a1Var = new f2.a1(-1, AndroidUtilities.dp(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(a1Var);
            view = view3;
        } else if (i9 != 5) {
            fh.d2 d2Var = new fh.d2(this, wyVar.getContext(), 16);
            TextView textView = new TextView(wyVar.getContext());
            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
            textView.setTextSize(1, 16.0f);
            int i10 = org.telegram.ui.ActionBar.f6.Le;
            textView.setTextColor(wyVar.z(i10));
            d2Var.addView(textView, g7.e6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(wyVar.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            imageView.setColorFilter(new PorterDuffColorFilter(wyVar.z(i10), PorterDuff.Mode.MULTIPLY));
            d2Var.addView(imageView, g7.e6.e(48, 48, 85));
            imageView.setOnClickListener(new sx(this));
            d2Var.setLayoutParams(new f2.a1(-1, -2));
            view = d2Var;
        } else {
            View view4 = new View(wyVar.getContext());
            view4.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(68.0f)));
            view = view4;
        }
        return new ik0(view);
    }
}
