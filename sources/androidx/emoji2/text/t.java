package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import g7.p6;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t extends SpannableStringBuilder {
    public final Class a;
    public final ArrayList b;

    public t(CharSequence charSequence, Class cls) {
        super(charSequence);
        this.b = new ArrayList();
        p6.a(cls, "watcherClass cannot be null");
        this.a = cls;
    }

    public final void a() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i9 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i9)).b.incrementAndGet();
            i9++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i9 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i9)).onTextChanged(this, 0, length(), length());
            i9++;
        }
    }

    public final s c(Object obj) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i9 >= arrayList.size()) {
                return null;
            }
            s sVar = (s) arrayList.get(i9);
            if (sVar.a == obj) {
                return sVar;
            }
            i9++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i9, int i10) {
        super.delete(i9, i10);
        return this;
    }

    public final void e() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i9 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i9)).b.decrementAndGet();
            i9++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        s c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        s c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        s c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i9, int i10, Class cls) {
        if (this.a != cls) {
            return super.getSpans(i9, i10, cls);
        }
        s[] sVarArr = (s[]) super.getSpans(i9, i10, s.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, sVarArr.length);
        for (int i11 = 0; i11 < sVarArr.length; i11++) {
            objArr[i11] = sVarArr[i11].a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i9, CharSequence charSequence) {
        super.insert(i9, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i9, int i10, Class cls) {
        if (cls == null || this.a == cls) {
            cls = s.class;
        }
        return super.nextSpanTransition(i9, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        s sVar;
        if (d(obj)) {
            sVar = c(obj);
            if (sVar != null) {
                obj = sVar;
            }
        } else {
            sVar = null;
        }
        super.removeSpan(obj);
        if (sVar != null) {
            this.b.remove(sVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i9, int i10, CharSequence charSequence) {
        replace(i9, i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i9, int i10, int i11) {
        if (d(obj)) {
            s sVar = new s(obj);
            this.b.add(sVar);
            obj = sVar;
        }
        super.setSpan(obj, i9, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i9, int i10) {
        return new t(this.a, this, i9, i10);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i9, int i10) {
        super.delete(i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i9, CharSequence charSequence) {
        super.insert(i9, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i9, int i10, CharSequence charSequence, int i11, int i12) {
        replace(i9, i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i9, CharSequence charSequence, int i10, int i11) {
        super.insert(i9, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i9, int i10, CharSequence charSequence) {
        a();
        super.replace(i9, i10, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i9, CharSequence charSequence, int i10, int i11) {
        super.insert(i9, charSequence, i10, i11);
        return this;
    }

    public t(Class cls, t tVar, int i9, int i10) {
        super(tVar, i9, i10);
        this.b = new ArrayList();
        p6.a(cls, "watcherClass cannot be null");
        this.a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i9, int i10, CharSequence charSequence, int i11, int i12) {
        a();
        super.replace(i9, i10, charSequence, i11, i12);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i9, int i10) {
        super.append(charSequence, i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i9, int i10) {
        super.append(charSequence, i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i9, int i10) {
        super.append(charSequence, i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i9) {
        super.append(charSequence, obj, i9);
        return this;
    }
}
