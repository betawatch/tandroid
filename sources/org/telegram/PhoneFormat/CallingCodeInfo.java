package org.telegram.PhoneFormat;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public class CallingCodeInfo {
    public ArrayList countries = new ArrayList();
    public String callingCode = "";
    public ArrayList trunkPrefixes = new ArrayList();
    public ArrayList intlPrefixes = new ArrayList();
    public ArrayList ruleSets = new ArrayList();

    String matchingAccessCode(String str) {
        ArrayList arrayList = this.intlPrefixes;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = (String) obj;
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    String matchingTrunkCode(String str) {
        ArrayList arrayList = this.trunkPrefixes;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = (String) obj;
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    String format(String str) {
        String str2;
        String str3;
        String str4 = null;
        if (str.startsWith(this.callingCode)) {
            str3 = this.callingCode;
            str2 = str.substring(str3.length());
        } else {
            String matchingTrunkCode = matchingTrunkCode(str);
            if (matchingTrunkCode != null) {
                str2 = str.substring(matchingTrunkCode.length());
                str4 = matchingTrunkCode;
                str3 = null;
            } else {
                str2 = str;
                str3 = null;
            }
        }
        ArrayList arrayList = this.ruleSets;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String format = ((RuleSet) obj).format(str2, str3, str4, true);
            if (format != null) {
                return format;
            }
        }
        ArrayList arrayList2 = this.ruleSets;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            String format2 = ((RuleSet) obj2).format(str2, str3, str4, false);
            if (format2 != null) {
                return format2;
            }
        }
        return (str3 == null || str2.length() == 0) ? str : String.format("%s %s", str3, str2);
    }
}
