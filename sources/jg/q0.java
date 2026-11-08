package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import bi.k5;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class q0 extends pj0 implements a6 {
    public static final o0[] j3 = {new o0(R.drawable.search_media_filled, 2131745410, new TLRPC.TL_inputMessagesFilterPhotoVideo(), 0), new o0(R.drawable.search_links_filled, 2131745413, new TLRPC.TL_inputMessagesFilterUrl(), 2), new o0(R.drawable.search_files_filled, 2131745417, new TLRPC.TL_inputMessagesFilterDocument(), 1), new o0(R.drawable.search_music_filled, 2131745408, new TLRPC.TL_inputMessagesFilterMusic(), 3), new o0(R.drawable.search_voice_filled, 2131745405, new TLRPC.TL_inputMessagesFilterRoundVoice(), 5)};
    public static final Pattern k3 = Pattern.compile("20[0-9]{1,2}");
    public static final Pattern l3 = Pattern.compile("(\\w{3,}) ([0-9]{0,4})");
    public static final Pattern m3 = Pattern.compile("([0-9]{0,4}) (\\w{2,})");
    public static final Pattern n3 = Pattern.compile("^([0-9]{1,4})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final Pattern o3 = Pattern.compile("^([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final int[] p3 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public final ArrayList e3;
    public final ArrayList f3;
    public final i0 g3;
    public boolean h3;
    public final l0 i3;

    public q0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.e3 = new ArrayList();
        this.f3 = new ArrayList();
        this.h3 = true;
        this.i3 = new l0(this);
        i0 i0Var = new i0((Object) this, 0);
        this.g3 = i0Var;
        i0Var.j1(0);
        setLayoutManager(i0Var);
        setAdapter(new k5(this, 1));
        i(new di.k(3));
        setItemAnimator(new k0());
        setWillNotDraw(false);
        setHideIfEmpty(false);
        setSelectorRadius(org.telegram.messenger.g0.L(28.0f));
        r6.m(this, 20, k6.i6, f6Var);
    }

    public static void A1(int i7, int i10, ArrayList arrayList) {
        int i11 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (i10 < 2013 || i10 > i11) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(i10, i7, 1, 0, 0, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (timeInMillis2 > timeInMillis) {
            return;
        }
        calendar.add(2, 1);
        arrayList.add(new m0(timeInMillis2, id.E0().v0().format(timeInMillis2), calendar.getTimeInMillis() - 1));
    }

    public static void B1(String str, ArrayList arrayList) {
        arrayList.clear();
        if (str == null) {
            return;
        }
        String trim = str.trim();
        if (trim.length() < 3) {
            return;
        }
        if (id.M0(2131745711, null).toLowerCase().startsWith(trim) || "today".startsWith(trim)) {
            Calendar calendar = Calendar.getInstance();
            int i7 = calendar.get(1);
            int i10 = calendar.get(2);
            int i11 = calendar.get(5);
            calendar.set(i7, i10, i11, 0, 0, 0);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.set(i7, i10, i11 + 1, 0, 0, 0);
            arrayList.add(new m0(timeInMillis, id.M0(2131745711, null), calendar.getTimeInMillis() - 1));
            return;
        }
        if (id.M0(2131745710, null).toLowerCase().startsWith(trim) || "yesterday".startsWith(trim)) {
            Calendar calendar2 = Calendar.getInstance();
            int i12 = calendar2.get(1);
            int i13 = calendar2.get(2);
            int i14 = calendar2.get(5);
            calendar2.set(i12, i13, i14, 0, 0, 0);
            long timeInMillis2 = calendar2.getTimeInMillis() - 86400000;
            calendar2.set(i12, i13, i14 + 1, 0, 0, 0);
            arrayList.add(new m0(timeInMillis2, id.M0(2131745710, null), calendar2.getTimeInMillis() - 86400001));
            return;
        }
        Calendar calendar3 = Calendar.getInstance();
        int i15 = -1;
        if (trim.length() > 3) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
            for (int i16 = 0; i16 < 7; i16++) {
                calendar3.set(7, i16);
                if (id.E0().B0().format(calendar3.getTime()).toLowerCase().startsWith(trim) || simpleDateFormat.format(calendar3.getTime()).toLowerCase().startsWith(trim)) {
                    i15 = i16;
                    break;
                }
            }
        }
        if (i15 >= 0) {
            Calendar calendar4 = Calendar.getInstance();
            long timeInMillis3 = calendar4.getTimeInMillis();
            calendar4.set(7, i15);
            if (calendar4.getTimeInMillis() > timeInMillis3) {
                calendar4.setTimeInMillis(calendar4.getTimeInMillis() - 604800000);
            }
            int i17 = calendar4.get(1);
            int i18 = calendar4.get(2);
            int i19 = calendar4.get(5);
            calendar4.set(i17, i18, i19, 0, 0, 0);
            long timeInMillis4 = calendar4.getTimeInMillis();
            calendar4.set(i17, i18, i19 + 1, 0, 0, 0);
            arrayList.add(new m0(timeInMillis4, id.E0().B0().format(timeInMillis4), calendar4.getTimeInMillis() - 1));
            return;
        }
        Matcher matcher = n3.matcher(trim);
        if (matcher.matches()) {
            String group = matcher.group(1);
            String group2 = matcher.group(3);
            int parseInt = Integer.parseInt(group);
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt <= 0 || parseInt > 31) {
                if (parseInt < 2013 || parseInt2 > 12) {
                    return;
                }
                A1(parseInt2 - 1, parseInt, arrayList);
                return;
            }
            if (parseInt2 >= 2013 && parseInt <= 12) {
                A1(parseInt - 1, parseInt2, arrayList);
                return;
            } else {
                if (parseInt2 <= 12) {
                    z1(parseInt - 1, parseInt2 - 1, arrayList);
                    return;
                }
                return;
            }
        }
        Matcher matcher2 = o3.matcher(trim);
        if (matcher2.matches()) {
            String group3 = matcher2.group(1);
            String group4 = matcher2.group(3);
            String group5 = matcher2.group(5);
            if (matcher2.group(2).equals(matcher2.group(4))) {
                int parseInt3 = Integer.parseInt(group3);
                int parseInt4 = Integer.parseInt(group4) - 1;
                int parseInt5 = Integer.parseInt(group5);
                if (parseInt5 >= 10 && parseInt5 <= 99) {
                    parseInt5 += 2000;
                }
                int i20 = parseInt5;
                int i21 = Calendar.getInstance().get(1);
                int i22 = parseInt3 - 1;
                if (parseInt4 < 0 || parseInt4 >= 12 || i22 < 0 || i22 >= p3[parseInt4] || i20 < 2013 || i20 > i21) {
                    return;
                }
                Calendar calendar5 = Calendar.getInstance();
                calendar5.set(i20, parseInt4, parseInt3, 0, 0, 0);
                long timeInMillis5 = calendar5.getTimeInMillis();
                calendar5.set(i20, parseInt4, parseInt3 + 1, 0, 0, 0);
                arrayList.add(new m0(timeInMillis5, id.E0().D0().format(timeInMillis5), calendar5.getTimeInMillis() - 1));
                return;
            }
            return;
        }
        if (k3.matcher(trim).matches()) {
            int intValue = Integer.valueOf(trim).intValue();
            int i23 = Calendar.getInstance().get(1);
            if (intValue < 2013) {
                while (i23 >= 2013) {
                    Calendar calendar6 = Calendar.getInstance();
                    calendar6.set(i23, 0, 1, 0, 0, 0);
                    long timeInMillis6 = calendar6.getTimeInMillis();
                    calendar6.set(i23 + 1, 0, 1, 0, 0, 0);
                    arrayList.add(new m0(timeInMillis6, Integer.toString(i23), calendar6.getTimeInMillis() - 1));
                    i23--;
                }
                return;
            }
            if (intValue <= i23) {
                Calendar calendar7 = Calendar.getInstance();
                calendar7.set(intValue, 0, 1, 0, 0, 0);
                long timeInMillis7 = calendar7.getTimeInMillis();
                calendar7.set(intValue + 1, 0, 1, 0, 0, 0);
                arrayList.add(new m0(timeInMillis7, Integer.toString(intValue), calendar7.getTimeInMillis() - 1));
                return;
            }
            return;
        }
        Matcher matcher3 = l3.matcher(trim);
        if (matcher3.matches()) {
            String group6 = matcher3.group(1);
            String group7 = matcher3.group(2);
            int C1 = C1(group6);
            if (C1 >= 0) {
                int intValue2 = Integer.valueOf(group7).intValue();
                if (intValue2 > 0 && intValue2 <= 31) {
                    z1(intValue2 - 1, C1, arrayList);
                    return;
                } else if (intValue2 >= 2013) {
                    A1(C1, intValue2, arrayList);
                    return;
                }
            }
        }
        Matcher matcher4 = m3.matcher(trim);
        if (matcher4.matches()) {
            String group8 = matcher4.group(1);
            int C12 = C1(matcher4.group(2));
            if (C12 >= 0) {
                int intValue3 = Integer.valueOf(group8).intValue();
                if (intValue3 > 0 && intValue3 <= 31) {
                    z1(intValue3 - 1, C12, arrayList);
                    return;
                } else if (intValue3 >= 2013) {
                    A1(C12, intValue3, arrayList);
                }
            }
        }
        if (TextUtils.isEmpty(trim) || trim.length() <= 2) {
            return;
        }
        int C13 = C1(trim);
        long timeInMillis8 = Calendar.getInstance().getTimeInMillis();
        if (C13 >= 0) {
            for (int i24 = Calendar.getInstance().get(1); i24 >= 2013; i24--) {
                Calendar calendar8 = Calendar.getInstance();
                calendar8.set(i24, C13, 1, 0, 0, 0);
                long timeInMillis9 = calendar8.getTimeInMillis();
                if (timeInMillis9 <= timeInMillis8) {
                    calendar8.add(2, 1);
                    arrayList.add(new m0(timeInMillis9, id.E0().v0().format(timeInMillis9), calendar8.getTimeInMillis() - 1));
                }
            }
        }
    }

    public static int C1(String str) {
        String[] strArr = {id.M0(2131749087, null).toLowerCase(), id.M0(2131750830, null).toLowerCase(), id.M0(2131748684, null).toLowerCase(), id.M0(2131754173, null).toLowerCase(), id.M0(2131748663, null).toLowerCase(), id.M0(2131749065, null).toLowerCase(), id.M0(2131749067, null).toLowerCase(), id.M0(2131753895, null).toLowerCase(), id.M0(2131745568, null).toLowerCase(), id.M0(2131747831, null).toLowerCase(), id.M0(2131747836, null).toLowerCase(), id.M0(2131751606, null).toLowerCase()};
        String[] strArr2 = new String[12];
        Calendar calendar = Calendar.getInstance();
        for (int i7 = 1; i7 <= 12; i7++) {
            calendar.set(0, 0, 0, 0, 0, 0);
            calendar.set(2, i7);
            strArr2[i7 - 1] = calendar.getDisplayName(2, 2, Locale.ENGLISH).toLowerCase();
        }
        for (int i10 = 0; i10 < 12; i10++) {
            if (strArr2[i10].startsWith(str) || strArr[i10].startsWith(str)) {
                return i10;
            }
        }
        return -1;
    }

    public static void z1(int i7, int i10, ArrayList arrayList) {
        int i11 = i10;
        if (i11 < 0 || i11 >= 12 || i7 < 0 || i7 >= p3[i11]) {
            return;
        }
        int i12 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance();
        int i13 = i12;
        while (i13 >= 2013) {
            if (i11 != 1 || i7 != 28 || gregorianCalendar.isLeapYear(i13)) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(i13, i11, i7 + 1, 0, 0, 0);
                long timeInMillis2 = calendar.getTimeInMillis();
                if (timeInMillis2 <= timeInMillis) {
                    calendar.set(i13, i10, i7 + 2, 0, 0, 0);
                    long timeInMillis3 = calendar.getTimeInMillis() - 1;
                    if (i13 == i12) {
                        arrayList.add(new m0(timeInMillis2, id.E0().q0().format(timeInMillis2), timeInMillis3));
                    } else {
                        arrayList.add(new m0(timeInMillis2, id.E0().D0().format(timeInMillis2), timeInMillis3));
                    }
                }
            }
            i13--;
            i11 = i10;
        }
    }

    public final void D1(ArrayList arrayList, ArrayList arrayList2, boolean z9) {
        ArrayList arrayList3 = this.f3;
        arrayList3.clear();
        ArrayList arrayList4 = this.e3;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Object obj = arrayList.get(i7);
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    o0 o0Var = new o0(R.drawable.search_users_filled, 4, p10.i(p10.s0).f().id == user.id ? id.M0(2131745904, null) : g5.m(10, user.first_name, user.last_name));
                    o0Var.f = user;
                    arrayList4.add(o0Var);
                } else if (obj instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj;
                    String str = chat.title;
                    if (str.length() > 12) {
                        str = rf.b.r(str.substring(0, 10), "...");
                    }
                    o0 o0Var2 = new o0(R.drawable.search_users_filled, 4, str);
                    o0Var2.f = chat;
                    arrayList4.add(o0Var2);
                }
            }
        }
        if (arrayList2 != null) {
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                m0 m0Var = (m0) arrayList2.get(i10);
                o0 o0Var3 = new o0(R.drawable.search_date_filled, 6, m0Var.a);
                o0Var3.g = m0Var;
                arrayList4.add(o0Var3);
            }
        }
        if (z9) {
            arrayList4.add(new o0(R.drawable.chats_archive, 2131754150, null, 7));
        }
        if (getAdapter() != null) {
            ca.i iVar = new ca.i(3, getAdapter(), false);
            v4.o.c(this.i3, true).b(iVar);
            if (arrayList4.isEmpty() || !iVar.b) {
                return;
            }
            this.g3.h1(0, 0);
        }
    }

    public ArrayList<t6> getThemeDescriptions() {
        ArrayList<t6> arrayList = new ArrayList<>();
        arrayList.add(new t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (s6) null, k6.e7));
        arrayList.add(new t6(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (s6) null, k6.f7));
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h3) {
            canvas.drawRect(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), k6.k0);
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        for (int i7 = 0; i7 < getCachedChildCount(); i7++) {
            View P = P(i7);
            if (P instanceof n0) {
                ((n0) P).updateColors();
            }
        }
        for (int i10 = 0; i10 < getAttachedScrapChildCount(); i10++) {
            View O = O(i10);
            if (O instanceof n0) {
                ((n0) O).updateColors();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
