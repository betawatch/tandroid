package of;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import g7.g6;
import java.util.ArrayList;
import java.util.Locale;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.s6;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.x4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.fc0;
import org.telegram.ui.jc0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class p0 extends c implements LocationController.LocationFetchCallback {
    public final int G;
    public final Context H;
    public int I;
    public s6 J;
    public Location K;
    public Location L;
    public String M;
    public String N;
    public Location O;
    public final int P;
    public final long Q;
    public int R;
    public MessageObject S;
    public TLRPC.TL_channelLocation T;
    public ArrayList U;
    public boolean V;
    public final boolean W;
    public final b6 X;
    public boolean Y;
    public TLRPC.TL_messageMediaVenue Z;
    public TLRPC.TL_messageMediaVenue a0;
    public boolean b0;
    public final boolean c0;
    public fc0 d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public FrameLayout h0;

    public p0(Context context, int i9, long j10, boolean z10, b6 b6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.G = UserConfig.selectedAccount;
        this.R = -1;
        this.U = new ArrayList();
        this.Y = true;
        this.f0 = false;
        this.g0 = false;
        this.c0 = z12;
        this.H = context;
        this.P = i9;
        this.Q = j10;
        this.W = z10;
        this.X = b6Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        if (i9 == 6) {
            if (LocationController.getInstance(this.G).getSharingLocationInfo(this.Q) == null && this.K == null) {
                return false;
            }
        } else if (i9 != 1 && i9 != 3 && i9 != 8 && i9 != 12 && i9 != 7) {
            return false;
        }
        return true;
    }

    public final void I() {
        int i9 = this.P;
        if (i9 == 8) {
            Location location = this.L;
            if (location == null && (location = this.K) == null) {
                return;
            }
            this.V = true;
            Q();
            LocationController.fetchLocationAddress(location, this.e ? 1 : 0, this);
            return;
        }
        if (i9 != 4) {
            Location location2 = this.L;
            if (location2 != null) {
                Location location3 = this.O;
                if (location3 == null || location3.distanceTo(location2) > 20.0f) {
                    this.N = null;
                }
                this.V = true;
                Q();
                LocationController.fetchLocationAddress(location2, this.d ? 2 : 0, this);
                return;
            }
            return;
        }
        Location location4 = this.L;
        if (location4 == null && (location4 = this.K) == null) {
            return;
        }
        Location location5 = this.O;
        if (location5 == null || location5.distanceTo(location4) > 100.0f) {
            this.N = null;
        }
        this.V = true;
        Q();
        LocationController.fetchLocationAddress(location4, this);
    }

    public final Object J(int i9) {
        int i10 = this.P;
        if (i10 == 4) {
            if (this.N == null) {
                return null;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            tL_messageMediaVenue.address = this.N;
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaVenue.geo = tL_geoPoint;
            Location location = this.L;
            if (location != null) {
                tL_geoPoint.lat = location.getLatitude();
                tL_messageMediaVenue.geo._long = this.L.getLongitude();
                return tL_messageMediaVenue;
            }
            Location location2 = this.K;
            if (location2 != null) {
                tL_geoPoint.lat = location2.getLatitude();
                tL_messageMediaVenue.geo._long = this.K.getLongitude();
            }
            return tL_messageMediaVenue;
        }
        MessageObject messageObject = this.S;
        ArrayList arrayList = this.s;
        if (messageObject == null) {
            int i11 = 2;
            if (i10 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.G).getSharingLocationInfo(this.Q);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i11 = 3;
                }
                if (i9 >= i11) {
                    return this.U.get(i9 - i11);
                }
                return null;
            }
            if (i10 == 1) {
                if (i9 > 4 && i9 < arrayList.size() + 5) {
                    return arrayList.get(i9 - 5);
                }
            } else if (i10 == 7) {
                int i12 = this.a0 == null ? 3 : 4;
                ArrayList arrayList2 = this.r;
                if (i9 > i12) {
                    int i13 = i12 + 1;
                    if (i9 < arrayList2.size() + i13) {
                        return arrayList2.get(i9 - i13);
                    }
                }
                int size = arrayList2.size() + i12;
                if (i9 > size) {
                    int i14 = size + 1;
                    if (i9 < arrayList.size() + i14) {
                        return arrayList.get(i9 - i14);
                    }
                }
            } else if (i9 > 3 && i9 < arrayList.size() + 4) {
                return arrayList.get(i9 - 4);
            }
        } else {
            if (i9 == 1) {
                return messageObject;
            }
            if (i9 > 4 && i9 < arrayList.size() + 4) {
                return this.U.get(i9 - 5);
            }
        }
        return null;
    }

    public final void L(Location location) {
        this.L = location;
        I();
        Q();
    }

    public final void M(Location location) {
        int i9;
        boolean z10 = this.K == null;
        this.K = location;
        if (this.L == null) {
            I();
        }
        if (z10 && (i9 = this.R) > 0) {
            m(i9);
        }
        if (this.S != null) {
            n(1, new Object());
            if (this.U.isEmpty()) {
                return;
            }
            r(2, this.U.size(), new Object());
            return;
        }
        if (this.P != 2) {
            Q();
        } else {
            if (this.U.isEmpty()) {
                return;
            }
            r(2, this.U.size(), new Object());
        }
    }

    public void N(ArrayList arrayList) {
        this.U = new ArrayList(arrayList);
        long clientUserId = UserConfig.getInstance(this.G).getClientUserId();
        for (int i9 = 0; i9 < this.U.size(); i9++) {
            if (((jc0) this.U.get(i9)).a == clientUserId || ((jc0) this.U.get(i9)).b.out) {
                this.U.remove(i9);
                break;
            }
        }
        l();
    }

    public final void O(boolean z10, boolean z11) {
        if (this.f0 == z10 && this.g0 == z11) {
            return;
        }
        this.f0 = z10;
        this.g0 = z11;
        if (z11) {
            this.Z = null;
            this.a0 = null;
        }
        l();
    }

    public final void P(int i9) {
        this.I = i9;
        FrameLayout frameLayout = this.h0;
        if (frameLayout != null) {
            f2.a1 a1Var = (f2.a1) frameLayout.getLayoutParams();
            if (a1Var == null) {
                a1Var = new f2.a1(-1, this.I);
            } else {
                ((ViewGroup.MarginLayoutParams) a1Var).height = this.I;
            }
            this.h0.setLayoutParams(a1Var);
            this.h0.forceLayout();
        }
    }

    public final void Q() {
        String str;
        s6 s6Var = this.J;
        if (s6Var != null) {
            int i9 = this.P;
            if (i9 == 8) {
                this.J.b(LocaleController.getString(R.string.SetThisLocation), !TextUtils.isEmpty(this.M) ? this.M : !TextUtils.isEmpty(this.N) ? this.N : this.V ? LocaleController.getString(R.string.Loading) : LocaleController.getString(R.string.UnknownLocation));
                this.J.setHasLocation(true);
                return;
            }
            str = "";
            if (i9 != 4 && this.L == null) {
                if (this.K != null) {
                    s6Var.b(LocaleController.getString(R.string.SendLocation), LocaleController.formatString(R.string.AccurateTo, LocaleController.formatPluralString("Meters", (int) this.K.getAccuracy(), new Object[0])));
                    this.J.setHasLocation(true);
                    return;
                } else {
                    s6Var.b(LocaleController.getString(R.string.SendLocation), this.f0 ? "" : LocaleController.getString(R.string.Loading));
                    this.J.setHasLocation(!this.f0);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.M)) {
                str = this.M;
            } else if (TextUtils.isEmpty(this.N)) {
                Location location = this.L;
                if ((location == null && this.K == null) || this.V) {
                    str = LocaleController.getString(R.string.Loading);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.L.getLongitude()));
                } else {
                    Location location2 = this.K;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.K.getLongitude()));
                    } else if (!this.f0) {
                        str = LocaleController.getString(R.string.Loading);
                    }
                }
            } else {
                str = this.N;
            }
            if (this.b0) {
                this.J.b(LocaleController.getString(R.string.AttachSelectedLocation), str);
            } else if (i9 == 4) {
                this.J.b(LocaleController.getString(R.string.ChatSetThisLocation), str);
            } else {
                this.J.b(LocaleController.getString(R.string.SendSelectedLocation), str);
            }
            this.J.setHasLocation(true);
        }
    }

    @Override // f2.r0
    public final int h() {
        int i9 = this.P;
        if (i9 != 6 && i9 != 5 && i9 != 4 && !this.e) {
            int i10 = 0;
            if (this.S != null) {
                if (!this.U.isEmpty()) {
                    i10 = this.U.size() + 3;
                } else if (!this.c0) {
                    i10 = 1;
                }
                r1 = 2 + i10;
            } else if (i9 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.G).getSharingLocationInfo(this.Q);
                int size = this.U.size() + 2;
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i10 = 1;
                }
                r1 = size + i10;
            } else {
                boolean z10 = this.h;
                boolean z11 = this.W;
                if (!z10 && this.f) {
                    ArrayList arrayList = this.s;
                    if (!arrayList.isEmpty()) {
                        r1 = arrayList.size() + this.r.size() + (z11 ? 1 : 0) + (i9 != 1 ? 5 : 6);
                    }
                }
                if (i9 == 0) {
                    r3 = 5;
                } else if (i9 == 7) {
                    r3 = (this.a0 != null ? 1 : 0) + 5;
                }
                boolean z12 = this.f0;
                r1 = ((((z12 || (!this.h && this.f)) ? 0 : 2) + (z11 ? 1 : 0)) - (z12 ? 2 : 0)) + r3;
            }
        }
        return (this.d0 == null || !this.e0) ? r1 : r1 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e5  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(int i9) {
        int i10;
        if (i9 == h() - 1 && this.d0 != null && this.e0) {
            return 13;
        }
        if (i9 == 0) {
            return 0;
        }
        int i11 = this.P;
        if (i11 == 6) {
            return 8;
        }
        if (this.W && i9 == h() - 1) {
            return 11;
        }
        if (i11 == 5) {
            return 8;
        }
        if (i11 != 4) {
            LocationController.SharingLocationInfo sharingLocationInfo = (i11 == 2 || i11 == 1) ? LocationController.getInstance(this.G).getSharingLocationInfo(this.Q) : null;
            if (this.S != null) {
                if (this.U.isEmpty()) {
                    return i9 == 2 ? 9 : 8;
                }
                if (i9 == 2) {
                    return 10;
                }
                if (i9 != 3) {
                    if (i9 != 4) {
                        return 8;
                    }
                    this.R = i9;
                    return 6;
                }
            } else {
                if (i11 == 2) {
                    if (i9 != 2 || sharingLocationInfo == null || sharingLocationInfo.period == Integer.MAX_VALUE) {
                        if (i9 != 1) {
                            return 8;
                        }
                        if (sharingLocationInfo == null || sharingLocationInfo.period != Integer.MAX_VALUE) {
                            this.R = i9;
                            return 6;
                        }
                    }
                    return 7;
                }
                ArrayList arrayList = this.s;
                if (i11 != 1) {
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.r;
                    int size2 = arrayList2.size() + size;
                    if (i11 == 7) {
                        if (i9 == 1) {
                            return 12;
                        }
                        if (this.a0 != null) {
                            if (i9 == 2) {
                                return 12;
                            }
                            i9--;
                            i10 = 3;
                            if (i9 != 1) {
                                if (i9 == 2) {
                                    return 10;
                                }
                                if (i9 != 3) {
                                    if (this.h || (arrayList.isEmpty() && arrayList2.isEmpty())) {
                                        if (i9 > 6 || ((!this.h && this.f) || this.f0)) {
                                        }
                                    } else if (i9 == size2 + i10) {
                                    }
                                    return 3;
                                }
                            }
                        }
                    }
                    i10 = 4;
                    if (i9 != 1) {
                    }
                } else if (i9 != 1) {
                    if (i9 == 2) {
                        if (sharingLocationInfo != null) {
                            this.R = -1;
                            return 7;
                        }
                        this.R = i9;
                        return 6;
                    }
                    if (i9 == 3) {
                        return 10;
                    }
                    if (i9 != 4) {
                        if (this.h || arrayList.isEmpty() || !this.f) {
                            if (i9 > 7 || ((!this.h && this.f) || this.f0)) {
                                return 4;
                            }
                        } else if (i9 == arrayList.size() + 5) {
                            return 5;
                        }
                        return 3;
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    @Override // org.telegram.messenger.LocationController.LocationFetchCallback
    public final void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        this.V = false;
        this.O = location;
        int i9 = this.P;
        if (i9 == 8) {
            this.N = str2;
        } else {
            this.N = str;
        }
        if (i9 == 7 && this.g0) {
            this.Z = null;
            this.a0 = null;
        }
        boolean z10 = this.a0 != null;
        if (i9 != 7) {
            Q();
            return;
        }
        this.Z = tL_messageMediaVenue;
        this.a0 = tL_messageMediaVenue2;
        if (z10 != (tL_messageMediaVenue2 == null)) {
            q(1, 2);
            return;
        }
        m(1);
        if (this.a0 == null) {
            u(2);
        } else {
            o(2);
        }
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11 = q1Var.f;
        View view = q1Var.a;
        int i12 = this.P;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        switch (i11) {
            case 0:
                f2.a1 a1Var = (f2.a1) view.getLayoutParams();
                if (a1Var == null) {
                    a1Var = new f2.a1(-1, this.I);
                } else {
                    ((ViewGroup.MarginLayoutParams) a1Var).height = this.I;
                }
                view.setLayoutParams(a1Var);
                break;
            case 1:
                this.J = (s6) view;
                Q();
                break;
            case 2:
                m4 m4Var = (m4) view;
                if (this.S == null) {
                    m4Var.setText(LocaleController.getString(R.string.NearbyVenue));
                    break;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.LiveLocations));
                    break;
                }
            case 3:
                u4 u4Var = (u4) view;
                if (i12 == 0) {
                    i10 = i9 - 4;
                } else {
                    if (i12 == 7 || i12 == 8) {
                        int i13 = i9 - 4;
                        if (this.a0 == null) {
                            i10 = i13;
                        }
                    }
                    i10 = i9 - 5;
                }
                if (this.f && (i12 != 7 || !this.h)) {
                    ArrayList arrayList = this.r;
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
                        u4Var.b(tL_messageMediaVenue, r3, true, false);
                        break;
                    } else {
                        int size = i10 - arrayList.size();
                        if (size >= 0) {
                            ArrayList arrayList2 = this.s;
                            if (size < arrayList2.size()) {
                                tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                            }
                        }
                    }
                }
                r3 = i10;
                u4Var.b(tL_messageMediaVenue, r3, true, false);
                break;
            case 4:
                ((w4) view).setLoading(this.h);
                break;
            case 6:
                s6 s6Var = (s6) view;
                s6Var.setHasLocation(this.K != null);
                int i14 = i9 + 1;
                if (i14 < h() && j(i14) == 7) {
                    r5 = true;
                }
                s6Var.s = r5;
                s6Var.invalidate();
                break;
            case 7:
                ((s6) view).setHasLocation(this.K != null);
                break;
            case 8:
                u7 u7Var = (u7) view;
                if (i12 != 6) {
                    TLRPC.TL_channelLocation tL_channelLocation = this.T;
                    long j10 = this.Q;
                    if (tL_channelLocation == null) {
                        MessageObject messageObject = this.S;
                        if (messageObject != null && i9 == 1) {
                            u7Var.b(messageObject, this.K, this.f0);
                            break;
                        } else {
                            int i15 = i9 - (messageObject != null ? 5 : 2);
                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.G).getSharingLocationInfo(j10);
                            if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                                i15--;
                            }
                            if (i15 >= 0 && i15 < this.U.size()) {
                                jc0 jc0Var = (jc0) this.U.get(i15);
                                Location location = this.K;
                                TextView textView = u7Var.d;
                                o9 o9Var = u7Var.a;
                                h5 h5Var = u7Var.b;
                                Location location2 = u7Var.v;
                                u7Var.s = jc0Var;
                                if (DialogObject.isUserDialog(jc0Var.a)) {
                                    TLRPC.User user = MessagesController.getInstance(u7Var.x).getUser(Long.valueOf(jc0Var.a));
                                    if (user != null) {
                                        u7Var.f.m(u7Var.x, user);
                                        h5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                                        o9Var.e(user, u7Var.f);
                                    }
                                } else {
                                    TLRPC.Chat chat = MessagesController.getInstance(u7Var.x).getChat(Long.valueOf(-jc0Var.a));
                                    if (chat != null) {
                                        u7Var.f.k(u7Var.x, chat);
                                        h5Var.l(chat.title, false);
                                        o9Var.e(chat, u7Var.f);
                                    }
                                }
                                IMapsProvider.LatLng position = jc0Var.e.getPosition();
                                location2.setLatitude(position.latitude);
                                location2.setLongitude(position.longitude);
                                int i16 = jc0Var.b.edit_date;
                                String formatLocationUpdateDate = LocaleController.formatLocationUpdateDate(i16 != 0 ? i16 : r11.date);
                                if (location == null) {
                                    textView.setText(formatLocationUpdateDate);
                                    break;
                                } else {
                                    textView.setText(formatLocationUpdateDate + " - " + LocaleController.formatDistance(location2.distanceTo(location), 0));
                                    break;
                                }
                            }
                        }
                    } else {
                        TextView textView2 = u7Var.d;
                        Location location3 = u7Var.v;
                        o9 o9Var2 = u7Var.a;
                        u7Var.x = UserConfig.selectedAccount;
                        String str = tL_channelLocation.address;
                        u7Var.f = null;
                        String str2 = "";
                        if (DialogObject.isUserDialog(j10)) {
                            TLRPC.User user2 = MessagesController.getInstance(u7Var.x).getUser(Long.valueOf(j10));
                            if (user2 != null) {
                                u7Var.f = new z8(0, user2);
                                str2 = UserObject.getUserName(user2);
                                o9Var2.e(user2, u7Var.f);
                            }
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(u7Var.x).getChat(Long.valueOf(-j10));
                            if (chat2 != null) {
                                z8 z8Var = new z8(chat2);
                                u7Var.f = z8Var;
                                str2 = chat2.title;
                                o9Var2.e(chat2, z8Var);
                            }
                        }
                        u7Var.b.l(str2, false);
                        location3.setLatitude(tL_channelLocation.geo_point.lat);
                        location3.setLongitude(tL_channelLocation.geo_point._long);
                        u7Var.e = true;
                        textView2.setSingleLine(true);
                        textView2.setText(str);
                        break;
                    }
                } else {
                    u7Var.b(this.S, this.K, this.f0);
                    break;
                }
                break;
            case 11:
                view.setBackgroundColor(f6.v0(this.f0 ? f6.i5 : f6.h5, this.X));
                break;
            case 12:
                u4 u4Var2 = (u4) view;
                if (!this.g0) {
                    if (i9 != 1) {
                        u4Var2.b(this.a0, 2, false, this.Y);
                        break;
                    } else {
                        u4Var2.b(this.Z, 2, this.a0 != null, this.Y);
                        break;
                    }
                } else {
                    u4Var2.b(null, 2, i9 == 1 && this.a0 != null, false);
                    break;
                }
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        View view2;
        long j10 = this.Q;
        b6 b6Var = this.X;
        Context context = this.H;
        switch (i9) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(context);
                this.h0 = frameLayout;
                frameLayout.setTag(-33024);
                this.h0.setLayoutParams(new f2.a1(-1, this.I));
                view2 = frameLayout;
                break;
            case 1:
                view2 = new s6(context, b6Var, false, false);
                break;
            case 2:
                view2 = new m4(context, b6Var);
                break;
            case 3:
                view2 = new u4(context, b6Var);
                break;
            case 4:
                w4 w4Var = new w4(context);
                RadialProgressView radialProgressView = new RadialProgressView(context, b6Var);
                w4Var.a = radialProgressView;
                w4Var.addView(radialProgressView, e6.e(-2, -2, 17));
                ImageView imageView = new ImageView(context);
                w4Var.c = imageView;
                imageView.setImageResource(R.drawable.location_empty);
                imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.W5, b6Var), PorterDuff.Mode.MULTIPLY));
                w4Var.addView(imageView, e6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 24.0f));
                TextView textView = new TextView(context);
                w4Var.b = textView;
                textView.setTextColor(f6.v0(f6.X5, b6Var));
                textView.setGravity(17);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 17.0f);
                textView.setText(LocaleController.getString(R.string.NoPlacesFound));
                w4Var.addView(textView, e6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
                view = w4Var;
                view2 = view;
                break;
            case 5:
                x4 x4Var = new x4(context);
                LinearLayout linearLayout = new LinearLayout(context);
                x4Var.addView(linearLayout, e6.e(-2, -2, 17));
                TextView g10 = org.telegram.messenger.l0.g(context, 1, 16.0f);
                int i10 = f6.A6;
                g10.setTextColor(f6.v0(i10, b6Var));
                g10.setText("Powered by");
                linearLayout.addView(g10, e6.n(-2, -2));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.foursquare);
                imageView2.setColorFilter(new PorterDuffColorFilter(f6.v0(i10, b6Var), PorterDuff.Mode.MULTIPLY));
                imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
                linearLayout.addView(imageView2, e6.n(35, -2));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                textView2.setTextColor(f6.v0(i10, b6Var));
                textView2.setText("Foursquare");
                linearLayout.addView(textView2, e6.n(-2, -2));
                view = x4Var;
                view2 = view;
                break;
            case 6:
                s6 s6Var = new s6(context, b6Var, true, false);
                s6Var.setDialogId(j10);
                view2 = s6Var;
                break;
            case 7:
                s6 s6Var2 = new s6(context, b6Var, true, true);
                s6Var2.setDialogId(j10);
                view2 = s6Var2;
                break;
            case 8:
                int i11 = this.P;
                view2 = new u7((i11 == 4 || i11 == 5 || i11 == 3) ? 16 : 54, context, b6Var, true);
                break;
            case 9:
                v4 v4Var = new v4(context);
                FrameLayout frameLayout2 = new FrameLayout(context);
                v4Var.a = frameLayout2;
                frameLayout2.setBackground(v5.e(new float[]{8.0f}, f6.v0(f6.Oh, b6Var)));
                v4Var.addView(frameLayout2, e6.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
                h5 h5Var = new h5(context);
                h5Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                h5Var.setGravity(17);
                h5Var.setDrawablePadding(AndroidUtilities.dp(8.0f));
                h5Var.setTextColor(f6.v0(f6.Sh, b6Var));
                h5Var.setTextSize(14);
                h5Var.l(LocaleController.getString(R.string.Directions), false);
                h5Var.setLeftDrawable(R.drawable.filled_directions);
                h5Var.setTypeface(AndroidUtilities.bold());
                frameLayout2.addView(h5Var, e6.c(-1.0f, -1));
                frameLayout2.setOutlineProvider(ff.r0.b);
                frameLayout2.setClipToOutline(true);
                g6.b(frameLayout2, 0.02f, 1.2f);
                v4Var.setOnButtonClick(new x8(this, 10));
                view2 = v4Var;
                break;
            case 10:
                View z6Var = new z6(context, (j2) null);
                new fq(new ColorDrawable(f6.v0(f6.a7, b6Var)), f6.V0(context, R.drawable.greydivider_bottom, f6.b7)).w = true;
                view2 = z6Var;
                break;
            case 11:
            default:
                view2 = new View(context);
                break;
            case 12:
                u4 u4Var = new u4(context, b6Var);
                u4Var.setAllowTextAnimation(true);
                view2 = u4Var;
                break;
            case 13:
                view2 = this.d0;
                break;
        }
        return new ik0(view2);
    }

    public void K() {
    }
}
