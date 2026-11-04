package m2;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import b8.ce;
import g9.s1;
import j$.util.Comparator$-CC;
import j$.util.Comparator$-EL;
import j$.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class y0 {
    public static final s1 a = g9.i0.u(12);

    public static g9.i0 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator$-EL.reversed(Comparator$-CC.comparing(new fa.b(1))));
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && g2.n0.M(audioProfile.getFormat())) {
                for (int i3 : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i3));
                }
            }
        }
        return g9.i0.q(treeSet);
    }

    public static g9.i0 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        g9.i0 i0Var;
        int speakerLayoutChannelMask;
        boolean a10 = ce.a(audioDeviceInfo.getType());
        s1 s1Var = a;
        if (!a10) {
            if (audioDeviceInfo.getType() == 1) {
                return g9.i0.u(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return g9.i0.u(Integer.valueOf(speakerLayoutChannelMask));
                }
                g2.a.l("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return s1Var;
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 31 || audioDeviceInfo.getType() != 10) {
                if (i3 >= 31) {
                    int type2 = audioDeviceInfo.getType();
                    if (i3 >= 31 && type2 == 29) {
                        g9.i0 a11 = a(audioDeviceInfo);
                        if (!a11.isEmpty()) {
                            return a11;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i3 >= 34) {
                            if (i3 < 34 || audioDescriptors == null) {
                                g9.g0 g0Var = g9.i0.b;
                                i0Var = s1.e;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                                while (it.hasNext()) {
                                    AudioDescriptor d = l2.d.d(it.next());
                                    if (d.getStandard() == 2) {
                                        byte[] descriptor = d.getDescriptor();
                                        if (descriptor.length != 3) {
                                            g2.a.l("AudioDescriptorUtil", "Invalid SADB length: " + descriptor.length);
                                        } else {
                                            if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                                byte b10 = descriptor[0];
                                                r10 = (b10 & 1) != 0 ? 12 : 0;
                                                if ((b10 & 2) != 0) {
                                                    r10 |= 32;
                                                }
                                                if ((b10 & 4) != 0) {
                                                    r10 |= 16;
                                                }
                                                if ((b10 & 8) != 0) {
                                                    r10 |= hs.W2;
                                                }
                                                if ((b10 & 16) != 0) {
                                                    r10 |= 1024;
                                                }
                                                if ((b10 & 32) != 0) {
                                                    r10 |= 768;
                                                }
                                                if ((b10 & 128) != 0) {
                                                    r10 |= 201326592;
                                                }
                                                byte b11 = descriptor[1];
                                                if ((b11 & 1) != 0) {
                                                    r10 |= 81920;
                                                }
                                                if ((b11 & 2) != 0) {
                                                    r10 |= TLObject.FLAG_13;
                                                }
                                                if ((b11 & 4) != 0) {
                                                    r10 |= 32768;
                                                }
                                                if ((b11 & 8) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b11 & 16) != 0) {
                                                    r10 |= 33554432;
                                                }
                                                if ((b11 & 32) != 0) {
                                                    r10 |= 262144;
                                                }
                                                if ((b11 & 64) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b11 & 128) != 0) {
                                                    r10 |= 3145728;
                                                }
                                                byte b12 = descriptor[2];
                                                if ((b12 & 1) != 0) {
                                                    r10 |= 655360;
                                                }
                                                if ((b12 & 2) != 0) {
                                                    r10 = 8388608 | r10;
                                                }
                                                if ((b12 & 4) != 0) {
                                                    r10 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(r10));
                                        }
                                    }
                                }
                                List.-EL.sort(arrayList, new a3.u(27));
                                i0Var = g9.i0.q(arrayList);
                            }
                            if (!i0Var.isEmpty()) {
                                return i0Var;
                            }
                        }
                        g9.i0 c2 = cg.n0.c(audioDescriptors);
                        if (!c2.isEmpty()) {
                            return c2;
                        }
                    }
                }
                if (i3 >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i3 >= 31 && type == 22))) {
                    g9.i0 a12 = a(audioDeviceInfo);
                    if (!a12.isEmpty()) {
                        return a12;
                    }
                }
            } else {
                g9.i0 a13 = a(audioDeviceInfo);
                if (!a13.isEmpty()) {
                    return a13;
                }
                g9.i0 c10 = cg.n0.c(audioDeviceInfo.getAudioDescriptors());
                if (!c10.isEmpty()) {
                    return c10;
                }
            }
        }
        return s1Var;
    }
}
